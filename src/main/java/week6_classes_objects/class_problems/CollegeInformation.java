package week6_classes_objects.class_problems;
public class CollegeInformation {
 private static final String collegeName="SRM Institute of Science and Technology"; private static int studentsCreated=0;
 public CollegeInformation(){studentsCreated++;}
 public static void printCollegeInfo(){System.out.println(collegeName);System.out.println("Students created: "+studentsCreated);}
 public static void main(String[] args){new CollegeInformation();new CollegeInformation();CollegeInformation.printCollegeInfo();}
}