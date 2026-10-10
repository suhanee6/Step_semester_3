package week8_abstraction.assigment_problems;
import java.time.LocalDate;import java.util.*;
public class StreamingPlanRenewalReminder {
 interface Plan{int days();}
 record Basic() implements Plan{public int days(){return 30;}}
 record Standard() implements Plan{public int days(){return 90;}}
 record Premium() implements Plan{public int days(){return 365;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=0;i<n;i++){String t=s.next(),name=s.next();LocalDate d=LocalDate.parse(s.next());Plan p=t.equals("BASIC")?new Basic():t.equals("STANDARD")?new Standard():new Premium();System.out.println(name+": "+d.plusDays(p.days()));}}
}