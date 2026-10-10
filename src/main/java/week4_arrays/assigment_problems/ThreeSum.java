package week4_arrays.assigment_problems;
import java.util.*;
public class ThreeSum {
 public static int[][] threeSum(int[] nums){Arrays.sort(nums);List<int[]> result=new ArrayList<>();for(int i=0;i<nums.length-2;i++){if(i>0&&nums[i]==nums[i-1])continue;int l=i+1,r=nums.length-1;while(l<r){long sum=(long)nums[i]+nums[l]+nums[r];if(sum==0){result.add(new int[]{nums[i],nums[l],nums[r]});int lv=nums[l],rv=nums[r];while(l<r&&nums[l]==lv)l++;while(l<r&&nums[r]==rv)r--;}else if(sum<0)l++;else r--;}}return result.toArray(new int[result.size()][]);}
 public static void main(String[] args){System.out.println(Arrays.deepToString(threeSum(new int[]{-1,0,1,2,-1,-4})));}
}