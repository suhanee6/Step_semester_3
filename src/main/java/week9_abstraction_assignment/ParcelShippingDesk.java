package week9_abstraction_assignment;
import java.util.*;
public class ParcelShippingDesk {
 interface Insurable{double insurance(double declared);}
 abstract static class Parcel{double weight,declared;Parcel(double w,double d){weight=w;declared=d;}abstract double charge();double insurance(){return this instanceof Insurable i?i.insurance(declared):0;}double total(){return charge()+insurance();}}
 static class Standard extends Parcel{Standard(double w,double d){super(w,d);}double charge(){return 40+10*weight;}}
 static class Express extends Parcel implements Insurable{Express(double w,double d){super(w,d);}double charge(){return 80+15*weight;}public double insurance(double d){return .02*d;}}
 static class Fragile extends Parcel implements Insurable{Fragile(double w,double d){super(w,d);}double charge(){return 40+10*weight+50;}public double insurance(double d){return .02*d;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();double w=s.nextDouble(),d=s.nextDouble();Parcel p=t.equals("STANDARD")?new Standard(w,d):t.equals("EXPRESS")?new Express(w,d):new Fragile(w,d);System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",t,p.charge(),p.insurance(),p.total());total+=p.total();}System.out.printf("Grand Total: %.2f%n",total);}
}