package week10_category_c;

import java.util.Locale;

public class StudentResultCardGenerator {
    static class Student {
        private final String name;
        private final int[] marks;

        Student(String name, int[] marks) {
            this.name = name;
            this.marks = marks;
        }

        double average() {
            int total = 0;
            for (int mark : marks) total += mark;
            return (double) total / marks.length;
        }

        char grade() {
            double average = average();
            if (average >= 75) return 'B';
            if (average >= 60) return 'C';
            if (average >= 40) return 'D';
            return 'F';
        }

        void printResult() {
            System.out.printf(Locale.ROOT, "%s: Average %.1f, Grade %c%n",
                    name.toUpperCase(Locale.ROOT), average(), grade());
        }
    }

    public static void main(String[] args) {
        new Student("Asha", new int[]{80, 90, 70}).printResult();
        new Student("Ravi", new int[]{60, 55, 50}).printResult();
    }
}