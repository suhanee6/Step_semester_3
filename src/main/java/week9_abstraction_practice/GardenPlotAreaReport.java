package week9_abstraction_practice;
import java.util.*;
public class GardenPlotAreaReport {
 interface Plot{String owner();String shape();double area();}
 record Circle(String owner,double radius) implements Plot{public String shape(){return "CIRCLE";}public double area(){return Math.PI*radius*radius;}}
 record Rectangle(String owner,double length,double width) implements Plot{public String shape(){return "RECTANGLE";}public double area(){return length*width;}}
 record Triangle(String owner,double base,double height) implements Plot{public String shape(){return "TRIANGLE";}public double area(){return .5*base*height;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next(),o=s.next();Plot p=t.equals("CIRCLE")?new Circle(o,s.nextDouble()):t.equals("RECTANGLE")?new Rectangle(o,s.nextDouble(),s.nextDouble()):new Triangle(o,s.nextDouble(),s.nextDouble());double a=p.area();System.out.printf("%s (%s): %.2f%n",p.owner(),p.shape(),a);total+=a;}System.out.printf("Total Area: %.2f%n",total);}
}