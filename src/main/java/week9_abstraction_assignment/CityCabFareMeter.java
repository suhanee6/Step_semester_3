package week9_abstraction_assignment;
import java.util.*;
public class CityCabFareMeter {
 interface NightService{double nightFare(double base);}
 abstract static class Cab{abstract double rate();double fare(double km){return Math.max(100,km*rate());}}
 static class Mini extends Cab{double rate(){return 10;}}
 static class Sedan extends Cab implements NightService{double rate(){return 14;}public double nightFare(double b){return b*1.2;}}
 static class SUV extends Cab implements NightService{double rate(){return 18;}public double nightFare(double b){return b*1.2;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();double km=s.nextDouble();String time=s.next();Cab c=t.equals("MINI")?new Mini():t.equals("SEDAN")?new Sedan():new SUV();if(time.equals("NIGHT")&&!(c instanceof NightService)){System.out.println(t+": night service not available");continue;}double base=c.fare(km),f=time.equals("NIGHT")?((NightService)c).nightFare(base):base;System.out.printf("%s: %.2f%n",t,f);total+=f;}System.out.printf("Total: %.2f%n",total);}
}