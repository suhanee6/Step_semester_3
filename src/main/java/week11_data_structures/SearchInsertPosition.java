package week11_data_structures;

public class SearchInsertPosition {
    public static int searchInsertPosition(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 6}, 5)); // 2
        System.out.println(searchInsertPosition(new int[]{1, 3, 5, 6}, 2)); // 1
    }
    // Time: O(log n); extra space: O(1).
}