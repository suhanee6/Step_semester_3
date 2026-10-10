package week8_abstraction.assigment_problems;
import java.util.*;
public class HostelElectricityBill {
 interface Room{double bill();}
 record Single(double units) implements Room{public double bill(){return units*8;}}
 record Shared(double units,int occupants) implements Room{public double bill(){return units*6/occupants;}}
 record AC(double units) implements Room{public double bill(){return units*10+200;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();double u=s.nextDouble();Room r=t.equals("SINGLE")?new Single(u):t.equals("SHARED")?new Shared(u,s.nextInt()):new AC(u);double a=r.bill();System.out.printf("%s: %.2f%n",t,a);total+=a;}System.out.printf("Total: %.2f%n",total);}
}