package week5_arrays_methods.class_problems;
public class HackathonSeatingGridOptimizer {
 private static double rowAverage(int[] row){if(row.length==0)return 0;long sum=0;for(int x:row)sum+=x;return (double)sum/row.length;}
 public static String classifyRows(int[][] seatingScores,int threshold){StringBuilder out=new StringBuilder();for(int i=0;i<seatingScores.length;i++){if(i>0)out.append(" | ");double avg=rowAverage(seatingScores[i]);out.append("Row ").append(i).append(": ").append(avg<threshold?"Quiet Zone":"Buzzing Zone");}return out.toString();}
 public static void main(String[] args){System.out.println(classifyRows(new int[][]{{40,50,45},{85,90,95},{30,20,25}},60));}
}