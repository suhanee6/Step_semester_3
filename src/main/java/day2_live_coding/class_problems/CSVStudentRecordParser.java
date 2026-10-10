package day2_live_coding.class_problems;
public class CSVStudentRecordParser {
 public static void parseStudentRecord(String csvLine) {
  String[] f=csvLine.split(",",-1); if(f.length!=3){System.out.println("Invalid Record");return;}
  System.out.printf("Name: %s | Roll No: %s | Dept: %s%n",f[0].trim(),f[1].trim(),f[2].trim());
 }
 public static void main(String[] args){parseStudentRecord("Ananya Verma,RA2211003010123,CSE");}
}