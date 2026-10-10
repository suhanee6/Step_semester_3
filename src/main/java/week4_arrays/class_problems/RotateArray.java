package week4_arrays.class_problems;
import java.util.Arrays;
public class RotateArray {
 public static int[] rotateArray(int[] nums,int k){int n=nums.length;if(n==0)return nums;k=((k%n)+n)%n;int[] out=new int[n];for(int i=0;i<n;i++)out[(i+k)%n]=nums[i];return out;}
 public static void main(String[] args){System.out.println(Arrays.toString(rotateArray(new int[]{1,2,3,4,5,6,7},3)));}
}