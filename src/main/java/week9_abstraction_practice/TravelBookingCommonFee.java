package week9_abstraction_practice;
import java.util.*;
public class TravelBookingCommonFee {
 abstract static class Booking{static final double FEE=50;abstract double baseFare();double total(){return baseFare()+FEE;}}
 static class Bus extends Booking{double d;Bus(double d){this.d=d;}double baseFare(){return d*2;}}
 static class Train extends Booking{double d;Train(double d){this.d=d;}double baseFare(){return d*1.5;}}
 static class Flight extends Booking{double d;Flight(double d){this.d=d;}double baseFare(){return 2500+d*4;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();double d=s.nextDouble();Booking b=t.equals("BUS")?new Bus(d):t.equals("TRAIN")?new Train(d):new Flight(d);System.out.printf("%s: %.2f%n",t,b.total());total+=b.total();}System.out.printf("Total: %.2f%n",total);}
}