package week12_practice;

import java.util.Scanner;

class Student {
    private final String name;
    private int a, b, c;

    Student(String name) { this.name = name; }

    boolean setMarks(int a, int b, int c) {
        if (a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100) return false;
        this.a = a; this.b = b; this.c = c;
        return true;
    }

    int total() { return a + b + c; }
    double average() { return total() / 3.0; }

    char grade() {
        double avg = average();
        if (avg >= 80) return 'A';
        if (avg >= 70) return 'B';
        if (avg >= 60) return 'C';
        if (avg >= 40) return 'D';
        return 'F';
    }

    @Override public String toString() {
        return String.format("%s total=%d avg=%.2f grade=%c", name, total(), average(), grade());
    }
}

public class ClassReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            Student student = new Student(name);
            if (student.setMarks(a, b, c)) students[count++] = student;
            else System.out.println(name + " skipped: marks must be 0 to 100");
        }

        int passes = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < count - 1; i++) {
                if (students[i].total() < students[i + 1].total()) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped) passes++;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
        System.out.println("Sorted in " + passes + " passes");
        sc.close();
    }
    // Bubble sort: best O(n) with early stop; worst O(n^2); extra array space O(n).
}