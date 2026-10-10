package week4_arrays.assigment_problems;
import java.util.Arrays;
public class ProductOfArrayExceptSelf {
 public static int[] productExceptSelf(int[] nums){int[] out=new int[nums.length];int left=1;for(int i=0;i<nums.length;i++){out[i]=left;left*=nums[i];}int right=1;for(int i=nums.length-1;i>=0;i--){out[i]*=right;right*=nums[i];}return out;}
 public static void main(String[] args){System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));}
}