package week11_sorting;

public class QueueInOrder {
    public static int firstBreak(int[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstBreak(new int[]{3, 5, 5, 8, 6, 9})); // 4
        System.out.println(firstBreak(new int[]{1, 2, 7})); // -1
        System.out.println(firstBreak(new int[]{})); // -1
    }
    // Time: O(n); extra space: O(1).
}