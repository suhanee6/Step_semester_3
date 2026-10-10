package week8_abstraction.class_problems;
import java.util.*;
public class DeliveryFeeCalculator {
 interface Delivery{double fee();}
 record Standard(double w,double d) implements Delivery{public double fee(){return 5+.5*w+.1*d;}}
 record Express(double w,double d) implements Delivery{public double fee(){return 15+w+.2*d;}}
 record International(double w,double d,double customs) implements Delivery{public double fee(){return 25+2*w+.5*d+customs;}}
 public static void main(String[] args){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();double w=s.nextDouble(),d=s.nextDouble();Delivery x=t.equals("STANDARD")?new Standard(w,d):t.equals("EXPRESS")?new Express(w,d):new International(w,d,s.nextDouble());double f=x.fee();System.out.printf("%s: %.2f%n",t,f);total+=f;}System.out.printf("Total: %.2f%n",total);}
}