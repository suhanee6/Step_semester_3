package week9_abstraction_practice;
import java.util.*;
public class LibraryLateFineCounter {
 interface Item{String title();double fine();}
 record Book(String title,int days) implements Item{public double fine(){return days*2.0;}}
 record DVD(String title,int days) implements Item{public double fine(){return Math.min(50,days*5.0);}}
 record Magazine(String title,int days) implements Item{public double fine(){return days*1.0;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next(),title=s.next();int d=s.nextInt();Item x=t.equals("BOOK")?new Book(title,d):t.equals("DVD")?new DVD(title,d):new Magazine(title,d);System.out.printf("%s: %.2f%n",x.title(),x.fine());total+=x.fine();}System.out.printf("Total Fines: %.2f%n",total);}
}