package week9_abstraction_practice;
import java.util.*;
public class ElectricityConnectionBilling {
 interface Connection{double bill();}
 record Home(double units) implements Connection{public double bill(){return Math.min(100,units)*5+Math.max(0,units-100)*7;}}
 record Shop(double units) implements Connection{public double bill(){return units*8+100;}}
 record Factory(double units) implements Connection{public double bill(){return Math.max(1000,units*6);}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();double u=s.nextDouble();Connection c=t.equals("HOME")?new Home(u):t.equals("SHOP")?new Shop(u):new Factory(u);double a=c.bill();System.out.printf("%s: %.2f%n",t,a);total+=a;}System.out.printf("Total: %.2f%n",total);}
}