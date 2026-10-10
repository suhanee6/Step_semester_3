package week6_classes_objects.class_problems;
public class Student {
 private String name; private static final String collegeName="SRM Institute of Science and Technology"; private static int studentCount=0;
 public Student(String name){this.name=name;studentCount++;}
 public void printStudent(){System.out.println(name+" studies at "+collegeName);}
 public static void printCollegeInfo(){System.out.println(collegeName);System.out.println("Students created: "+studentCount);}
 public static void main(String[] args){new Student("Asha");new Student("Ravi");Student.printCollegeInfo();}
}