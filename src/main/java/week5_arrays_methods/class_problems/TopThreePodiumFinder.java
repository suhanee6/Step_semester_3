package week5_arrays_methods.class_problems;
import java.util.Arrays;
public class TopThreePodiumFinder {
 public static int[] findTopThreeScores(int[] scores){if(scores.length<3)throw new IllegalArgumentException("At least three scores required");int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;for(int s:scores){if(s>=first){third=second;second=first;first=s;}else if(s>=second){third=second;second=s;}else if(s>third)third=s;}return new int[]{first,second,third};}
 public static void main(String[] args){System.out.println(Arrays.toString(findTopThreeScores(new int[]{45,82,79,90,33,90,61})));}
}