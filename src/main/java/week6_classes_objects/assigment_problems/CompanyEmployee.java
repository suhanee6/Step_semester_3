package week6_classes_objects.assigment_problems;
public class CompanyEmployee {
 private String empName;private double salary;private static String companyName="Bright Horizon Technologies";private static int employeeCount=0;
 public CompanyEmployee(String empName,double salary){this.empName=empName;this.salary=salary;employeeCount++;}
 public static void printCompanyInfo(){System.out.println(companyName);System.out.println("Employees on record: "+employeeCount);}
 public static void main(String[] args){new CompanyEmployee("Asha",50000);new CompanyEmployee("Ravi",60000);new CompanyEmployee("Neha",45000);CompanyEmployee.printCompanyInfo();}
}