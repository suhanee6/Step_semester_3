package week5_arrays_methods.assigment_problems;
public class TopPerformerTracker {
 public static String findMinMaxSpread(int[] scores){if(scores.length<2)throw new IllegalArgumentException("At least two scores required");int min=scores[0],max=scores[0];for(int s:scores){if(s<min)min=s;if(s>max)max=s;}return "Min: "+min+" | Max: "+max+" | Spread: "+(max-min);}
 public static void main(String[] args){System.out.println(findMinMaxSpread(new int[]{45,82,79,90,33,90,61}));}
}