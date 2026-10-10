package week7_encapsulation.class_problems;
public final class NameTag {
 private final String firstName,lastInitial;
 public NameTag(String fullName){String[] parts=fullName.split(" ");if(parts.length!=2)throw new IllegalArgumentException("Expected first and last name");firstName=parts[0];lastInitial=parts[1].substring(0,1);}
 public String getNickname(){return firstName+" "+lastInitial+".";}
 public static void main(String[] args){System.out.println(new NameTag("Maria Gomez").getNickname());}
}