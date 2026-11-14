package week11_practice;

import java.util.Scanner;

public class WeeklyRainfallAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] rainfall = new double[7];
        double total = 0;
        int wettestIndex = 0, dryDays = 0;

        for (int i = 0; i < 7; i++) {
            rainfall[i] = sc.nextDouble();
            total += rainfall[i];
            if (rainfall[i] > rainfall[wettestIndex] || i == 0) wettestIndex = i;
            if (rainfall[i] == 0.0) dryDays++;
        }

        System.out.print("Rainfall (mm):");
        for (double value : rainfall) System.out.printf(" %.1f", value);
        System.out.println();
        System.out.printf("Total Rainfall: %.1f mm%n", total);
        System.out.printf("Average Rainfall: %.2f mm%n", total / 7.0);
        System.out.printf("Wettest Day: Day %d (%.1f mm)%n", wettestIndex + 1, rainfall[wettestIndex]);
        System.out.println("Total Dry Days: " + dryDays);
        sc.close();
    }
    // Time: O(7) = O(1); space: O(7) = O(1), since the array size is fixed.
}