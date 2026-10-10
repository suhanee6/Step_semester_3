package week8_abstraction.assigment_problems;
import java.util.*;
public class FestivalBonusCalculator {
 interface Employee{double bonus();}
 record FullTime(double salary) implements Employee{public double bonus(){return salary*.1;}}
 record PartTime(double salary) implements Employee{public double bonus(){return salary*.05;}}
 record Intern(double salary) implements Employee{public double bonus(){return 2000;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next(),name=s.next();double sal=s.nextDouble();Employee e=t.equals("FULLTIME")?new FullTime(sal):t.equals("PARTTIME")?new PartTime(sal):new Intern(sal);double a=e.bonus();System.out.printf("%s: %.2f%n",name,a);total+=a;}System.out.printf("Total Bonus: %.2f%n",total);}
}