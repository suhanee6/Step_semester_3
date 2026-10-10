package week10_category_c;

import java.util.Scanner;

public class LeapYearDetector {
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeapYear(year) ? "Leap year" : "Not a leap year");
        sc.close();
    }
}