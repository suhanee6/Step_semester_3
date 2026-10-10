package week6_classes_objects.assigment_problems;
public class Employee {
 private String empName; private double salary; private static String companyName="Bright Horizon Technologies"; private static int employeeCount=0;
 public Employee(String empName,double salary){this.empName=empName;this.salary=salary;employeeCount++;}
 public static void printCompanyInfo(){System.out.println(companyName);System.out.println("Employees on record: "+employeeCount);}
 public static void main(String[] args){new Employee("Asha",50000);new Employee("Ravi",60000);new Employee("Neha",45000);Employee.printCompanyInfo();}
}