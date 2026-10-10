package week7_encapsulation.assigment_problems;
public final class PasswordChecker {
 private final String password;
 public PasswordChecker(String password){this.password=password;}
 public String getStrength(){int n=password.length();return n<6?"Weak":n<=9?"Medium":"Strong";}
 public static void main(String[] args){System.out.println(new PasswordChecker("abcd").getStrength());System.out.println(new PasswordChecker("abcdefgh").getStrength());System.out.println(new PasswordChecker("abcdefghijkl").getStrength());}
}