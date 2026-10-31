package week10_sorting;

import java.util.Arrays;

public class PrizeTable {
    // Selection sort in descending order; count only swaps that are performed.
    public static int prizeTable(int[] marks) {
        int swaps = 0;
        for (int i = 0; i < marks.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] > marks[maxIndex]) maxIndex = j;
            }
            if (maxIndex != i) {
                int temp = marks[i];
                marks[i] = marks[maxIndex];
                marks[maxIndex] = temp;
                swaps++;
            }
        }
        System.out.println(Arrays.toString(marks));
        return swaps;
    }

    public static void main(String[] args) {
        System.out.println("Swaps = " + prizeTable(new int[]{45, 90, 60, 75}));
        System.out.println("Swaps = " + prizeTable(new int[]{80, 70, 60}));
    }
    // Time O(n^2); extra space O(1).
}