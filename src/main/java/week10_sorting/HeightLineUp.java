package week10_sorting;

import java.util.Arrays;

public class HeightLineUp {
    // Bubble sort: prints the array after every left-to-right sweep.
    public static void lineUp(int[] heights) {
        for (int end = heights.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int j = 0; j < end; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("Pass: " + Arrays.toString(heights));
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        lineUp(new int[]{4, 2, 5, 1});
        lineUp(new int[]{1, 3, 2, 4});
    }
    // Worst-case time O(n^2), best-case O(n); extra space O(1).
}