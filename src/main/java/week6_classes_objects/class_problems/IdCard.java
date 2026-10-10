package week6_classes_objects.class_problems;
public class IdCard {
 String name; int booksIssued;
 public IdCard(String name,int booksIssued){this.name=name;this.booksIssued=booksIssued;}
 public static void main(String[] args){IdCard ravi=new IdCard("Ravi",0);IdCard alias=ravi;alias.booksIssued=3;System.out.println("Books issued via first reference: "+ravi.booksIssued);System.out.println("Same object: "+(ravi==alias));IdCard separate=new IdCard("Ravi",3);System.out.println("Separate object same values: "+(ravi==separate));}
}