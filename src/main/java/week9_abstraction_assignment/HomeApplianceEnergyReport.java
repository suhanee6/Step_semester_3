package week9_abstraction_assignment;
import java.util.*;
public class HomeApplianceEnergyReport {
 interface Saver{double factor();}
 abstract static class Appliance{double hours;Appliance(double h){hours=h;}abstract double watts();double units(){return watts()*hours/1000;}}
 static class Fridge extends Appliance{Fridge(double h){super(h);}double watts(){return 150;}}
 static class AC extends Appliance implements Saver{AC(double h){super(h);}double watts(){return 1500;}public double factor(){return .75;}}
 static class TV extends Appliance{TV(double h){super(h);}double watts(){return 100;}}
 static class Washer extends Appliance implements Saver{Washer(double h){super(h);}double watts(){return 500;}public double factor(){return .75;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();double h=s.nextDouble();boolean saver=s.hasNext("SAVER");if(saver)s.next();Appliance a=t.equals("FRIDGE")?new Fridge(h):t.equals("AC")?new AC(h):t.equals("TV")?new TV(h):new Washer(h);if(saver&&!(a instanceof Saver)){System.out.println(t+": saver mode not supported");continue;}double factor=saver?((Saver)a).factor():1,units=a.units()*factor,cost=units*8;System.out.printf("%s: Units=%.2f Cost=%.2f%n",t,units,cost);total+=cost;}System.out.printf("Total Cost: %.2f%n",total);}
}