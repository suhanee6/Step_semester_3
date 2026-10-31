package week11_sorting;

import java.util.Arrays;

public class DiceThrowTally {
    public static int[] diceSort(int[] rolls) {
        int[] count = new int[7];
        for (int roll : rolls) {
            if (roll < 1 || roll > 6) throw new IllegalArgumentException("Rolls must be from 1 to 6");
            count[roll]++;
        }
        int[] sorted = new int[rolls.length];
        int index = 0;
        for (int value = 1; value <= 6; value++) {
            for (int occurrence = 0; occurrence < count[value]; occurrence++) {
                sorted[index++] = value;
            }
        }
        System.out.print("Counts: ");
        for (int value = 1; value <= 6; value++) {
            System.out.print(value + ":" + count[value] + (value == 6 ? "" : " "));
        }
        System.out.println();
        return sorted;
    }

    public static void main(String[] args) {
        int[] rolls = {4, 1, 6, 4, 2, 1, 4};
        System.out.println("Sorted: " + Arrays.toString(diceSort(rolls)));
    }
    // Time: O(n + 6) = O(n); auxiliary count space: O(1).
}