package week11_sorting;

import java.util.Arrays;

public class PrizeTable {
    // Sorts marks in descending order and returns the number of swaps.
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
        return swaps;
    }

    public static void main(String[] args) {
        int[] first = {45, 90, 60, 75};
        int[] second = {80, 70, 60};
        System.out.println(Arrays.toString(first) + " swaps = " + prizeTable(first));
        System.out.println(Arrays.toString(second) + " swaps = " + prizeTable(second));
    }
    // Selection sort: O(n^2) time and O(1) extra space.
}