package week10_category_c;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number + (isPrime(number) ? " is prime" : " is not prime"));
        sc.close();
    }
    // Time: O(sqrt(n)); extra space: O(1).
}