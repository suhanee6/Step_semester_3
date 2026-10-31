package week11_data_structures;

import java.util.Arrays;

public class PairSumInSortedArray {
    // Returns the pair of values, or null when no pair exists.
    public static int[] pairSumSorted(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) return new int[]{nums[left], nums[right]};
            if (sum < target) left++;
            else right--;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] first = pairSumSorted(new int[]{-4, -1, 0, 3, 5, 9}, 4);
        int[] second = pairSumSorted(new int[]{1, 2, 3}, 100);
        System.out.println(first == null ? "Not Found" : Arrays.toString(first));
        System.out.println(second == null ? "Not Found" : Arrays.toString(second));
    }
    // Time: O(n); extra space: O(1).
}