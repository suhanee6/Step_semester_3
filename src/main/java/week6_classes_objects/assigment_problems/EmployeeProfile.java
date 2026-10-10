package week6_classes_objects.assigment_problems;
public class EmployeeProfile {
 private String empId,empName;private double salary;private boolean isIntern;
 public EmployeeProfile(String empId,String empName,double salary){this.empId=empId;this.empName=empName;this.salary=salary;this.isIntern=false;}
 public EmployeeProfile(String empId,String empName){this(empId,empName,0);this.isIntern=true;}
 public void printProfile(){System.out.printf("%s | %s | Rs %.1f | Intern: %s%n",empId,empName,salary,isIntern);}
 public static void main(String[] args){new EmployeeProfile("E-101","Divya",65000).printProfile();new EmployeeProfile("E-102","Arjun").printProfile();}
}