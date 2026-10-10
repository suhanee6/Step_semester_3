package week8_abstraction.class_problems;
import java.util.*;
import java.util.regex.*;
public class ExaminationQuestionGrader {
 static List<String> parse(String line){
  Matcher m=Pattern.compile("\"([^\"]*)\"|(\\S+)").matcher(line);
  List<String>a=new ArrayList<>();
  while(m.find())a.add(m.group(1)!=null?m.group(1):m.group(2));
  return a;
 }
 static double score(String type,String correct,String answer,double points){
  if(type.equals("MCQ")||type.equals("TF"))return correct.equalsIgnoreCase(answer)?points:0;
  int found=0;
  for(String k:correct.split(","))if(!k.trim().isEmpty()&&answer.toLowerCase().contains(k.trim().toLowerCase()))found++;
  return found>=2?points*.75:found==1?points*.5:0;
 }
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);int n=Integer.parseInt(s.nextLine().trim());double total=0;
  for(int i=0;i<n;i++){List<String>t=parse(s.nextLine());String type=t.get(0);double v=score(type,t.get(2),t.get(3),Double.parseDouble(t.get(4)));System.out.printf("%s: %.2f%n",type,v);total+=v;}
  System.out.printf("Total Score: %.2f%n",total);
 }
}