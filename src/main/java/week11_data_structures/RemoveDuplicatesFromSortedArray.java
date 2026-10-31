package week11_data_structures;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    // Returns the number of unique values; the unique prefix is stored in nums[0..length-1].
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int uniqueCount = 1;
        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[uniqueCount - 1]) {
                nums[uniqueCount] = nums[read];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(nums);
        System.out.println("length = " + length);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, length)));
    }
    // Time: O(n); extra space: O(1).
}