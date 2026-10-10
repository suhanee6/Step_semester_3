package week10_category_c;

import java.util.Scanner;

public class FactorialCalculation {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0 || n > 20) {
            System.out.println("Enter a number from 0 to 20.");
        } else {
            System.out.println(factorial(n));
        }
        sc.close();
    }
    // Time: O(n); extra space: O(1). long safely holds factorials through 20!.
}