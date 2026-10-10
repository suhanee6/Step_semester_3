package week8_abstraction.assigment_problems;
import java.util.*;
public class CanteenBillingCounter {
 interface Bill{double amount();}
 record Student(double a) implements Bill{public double amount(){return a*.9;}}
 record Staff(double a) implements Bill{public double amount(){return a*.95;}}
 record Guest(double a) implements Bill{public double amount(){return a+10;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();double a=s.nextDouble();Bill b=t.equals("STUDENT")?new Student(a):t.equals("STAFF")?new Staff(a):new Guest(a);double v=b.amount();System.out.printf("%s: %.2f%n",t,v);total+=v;}System.out.printf("Total: %.2f%n",total);}
}