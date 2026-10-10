package day1_live_coding.class_problems;

public class TeamBMICalculator {
    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        if (heights == null || weights == null || heights.length != weights.length)
            throw new IllegalArgumentException("Height and weight arrays must have equal lengths.");

        System.out.printf("%-8s | %-12s | %-12s | %-8s | %s%n",
                "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] <= 0 || weights[i] <= 0) {
                System.out.printf("Person %d has invalid height or weight.%n", i + 1);
                continue;
            }
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("Person %-2d | %-12.2f | %-12.2f | %-8.2f | %s%n",
                    i + 1, heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {
        double[] heights = {1.75, 1.60};
        double[] weights = {70.0, 90.0};
        printWellnessReport(heights, weights);
    }
}