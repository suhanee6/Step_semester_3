package week9_abstraction_assignment;
import java.util.*;
public class CollegeFeeCounter {
 interface BusUser{double transportFee();}
 abstract static class Student{String name;Student(String n){name=n;}abstract double tuition();double total(){return tuition()+(this instanceof BusUser b?b.transportFee():0);}}
 static class DayScholar extends Student implements BusUser{DayScholar(String n){super(n);}double tuition(){return 40000;}public double transportFee(){return 12000;}}
 static class Hosteller extends Student{Hosteller(String n){super(n);}double tuition(){return 100000;}}
 static class Scholar extends Student implements BusUser{Scholar(String n){super(n);}double tuition(){return 20000;}public double transportFee(){return 12000;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next(),name=s.next();Student p=t.equals("DAY_SCHOLAR")?new DayScholar(name):t.equals("HOSTELLER")?new Hosteller(name):new Scholar(name);System.out.printf("%s: %.2f%n",name,p.total());total+=p.total();}System.out.printf("Total Collected: %.2f%n",total);}
}