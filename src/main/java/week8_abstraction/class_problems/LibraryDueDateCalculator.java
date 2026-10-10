package week8_abstraction.class_problems;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.*;
public class LibraryDueDateCalculator {
 static String[] tokens(String line){
  Matcher m=Pattern.compile("\"([^\"]*)\"|(\\S+)").matcher(line);
  List<String> a=new ArrayList<>();
  while(m.find())a.add(m.group(1)!=null?m.group(1):m.group(2));
  return a.toArray(new String[0]);
 }
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  int n=Integer.parseInt(s.nextLine().trim());
  LocalDate base=LocalDate.parse("2023-10-26");
  for(int i=0;i<n;i++){
   String[] t=tokens(s.nextLine());
   int days=t[0].equals("BOOK")?14:t[0].equals("DVD")?7:3;
   System.out.println(t[1]+": "+base.plusDays(days));
  }
 }
}