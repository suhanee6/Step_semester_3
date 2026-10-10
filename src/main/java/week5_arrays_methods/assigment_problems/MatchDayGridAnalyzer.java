package week5_arrays_methods.assigment_problems;
public class MatchDayGridAnalyzer {
 private static double rowAverage(int[] row){if(row.length==0)return 0;long sum=0;for(int n:row)sum+=n;return (double)sum/row.length;}
 public static String classifyMatches(int[][] runsPerOver,int threshold){StringBuilder out=new StringBuilder();for(int i=0;i<runsPerOver.length;i++){if(i>0)out.append(" | ");out.append("Match ").append(i).append(": ").append(rowAverage(runsPerOver[i])>=threshold?"Power Surge":"Normal");}return out.toString();}
 public static void main(String[] args){System.out.println(classifyMatches(new int[][]{{4,6,8},{10,12,14},{2,3,1}},8));}
}