package week7_encapsulation.assigment_problems;
public class TrafficLight {
 private final String id;private String color="RED";
 public TrafficLight(String id){this.id=id;}
 public void next(){if(color.equals("RED"))color="GREEN";else if(color.equals("GREEN"))color="YELLOW";else color="RED";}
 public String getColor(){return color;}public String getId(){return id;}
 public static void main(String[] args){TrafficLight t=new TrafficLight("TL-9");for(int i=0;i<4;i++){System.out.println(t.getColor());t.next();}}
}