package week9_abstraction_practice;
import java.util.*;
public class WeeklyStaffPay {
 interface Staff{String name();double pay();}
 record FullTime(String name,double salary) implements Staff{public double pay(){return salary;}}
 record Hourly(String name,double hours,double rate) implements Staff{public double pay(){return Math.min(40,hours)*rate+Math.max(0,hours-40)*rate*1.5;}}
 record Intern(String name,double stipend) implements Staff{public double pay(){return stipend;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next(),name=s.next();Staff p=t.equals("FULLTIME")?new FullTime(name,s.nextDouble()):t.equals("HOURLY")?new Hourly(name,s.nextDouble(),s.nextDouble()):new Intern(name,s.nextDouble());System.out.printf("%s: %.2f%n",p.name(),p.pay());total+=p.pay();}System.out.printf("Total Payroll: %.2f%n",total);}
}