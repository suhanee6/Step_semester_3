package week10_arrays;

public class ExamScoreBandCounter {
    // Returns the number of scores in the inclusive range [low, high].
    // The input array must be sorted in ascending order.
    public static int countInBand(int[] scores, int low, int high) {
        return firstGreaterThan(scores, high) - firstAtLeast(scores, low);
    }

    private static int firstAtLeast(int[] scores, int target) {
        int left = 0, right = scores.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    private static int firstGreaterThan(int[] scores, int target) {
        int left = 0, right = scores.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] <= target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores, 42, 58)); // 6
        System.out.println(countInBand(scores, 90, 100)); // 0
    }
    // Time: O(log n); extra space: O(1). A linear scan takes O(n).
}