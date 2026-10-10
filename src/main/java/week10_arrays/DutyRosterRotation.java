package week10_arrays;
import java.util.Arrays;
public class DutyRosterRotation {
 public static String[] rotateRoster(String[] names,long k){int n=names.length;if(n==0)return names;int shift=(int)(k%n);String[] out=new String[n];for(int i=0;i<n;i++)out[(i+shift)%n]=names[i];return out;}
 public static void main(String[] args){System.out.println(Arrays.toString(rotateRoster(new String[]{"A","B","C","D","E"},2)));System.out.println(Arrays.toString(rotateRoster(new String[]{"A","B","C","D","E"},7)));}
 // Time O(n), extra space O(n). k % n avoids rotating one place at a time.
}