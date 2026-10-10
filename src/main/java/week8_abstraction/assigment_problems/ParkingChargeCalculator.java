package week8_abstraction.assigment_problems;
import java.util.*;
public class ParkingChargeCalculator {
 interface Vehicle{double charge();}
 record Bike(int h) implements Vehicle{public double charge(){return h*10.0;}}
 record Car(int h) implements Vehicle{public double charge(){return 30+Math.max(0,h-1)*20.0;}}
 record Truck(int h) implements Vehicle{public double charge(){return Math.max(100,h*50.0);}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();int h=s.nextInt();Vehicle v=t.equals("BIKE")?new Bike(h):t.equals("CAR")?new Car(h):new Truck(h);double a=v.charge();System.out.printf("%s: %.2f%n",t,a);total+=a;}System.out.printf("Total: %.2f%n",total);}
}