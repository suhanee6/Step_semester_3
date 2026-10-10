package week9_abstraction_assignment;
import java.util.*;
public class MovieTicketCounter {
 abstract static class Ticket{static final double FEE=20;int count;Ticket(int c){count=c;}abstract double price();double amount(){return count*(price()+FEE);}}
 static class Regular extends Ticket{Regular(int n){super(n);}double price(){return 150;}}
 static class Premium extends Ticket{Premium(int n){super(n);}double price(){return 250;}}
 static class Recliner extends Ticket{Recliner(int n){super(n);}double price(){return 400;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();int c=s.nextInt();Ticket a=t.equals("REGULAR")?new Regular(c):t.equals("PREMIUM")?new Premium(c):new Recliner(c);System.out.printf("%s: %.2f%n",t,a.amount());total+=a.amount();}System.out.printf("Total: %.2f%n",total);}
}