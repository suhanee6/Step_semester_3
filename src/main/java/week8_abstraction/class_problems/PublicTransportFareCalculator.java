package week8_abstraction.class_problems;
import java.util.*;
public class PublicTransportFareCalculator {
 interface Transport{double fare();}
 record Bus(double d) implements Transport{public double fare(){return Math.min(10,2+.1*d);}}
 record Train(double d) implements Transport{public double fare(){return 3+.15*d;}}
 record Metro(double d,double factor) implements Transport{public double fare(){return (1.5+.2*d)*factor;}}
 public static void main(String[] args){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();double d=s.nextDouble();Transport x=t.equals("BUS")?new Bus(d):t.equals("TRAIN")?new Train(d):new Metro(d,s.nextDouble());double f=x.fare();System.out.printf("%s: %.2f%n",t,f);total+=f;}System.out.printf("Total: %.2f%n",total);}
}