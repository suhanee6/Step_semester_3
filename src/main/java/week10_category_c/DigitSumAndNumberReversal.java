package week10_category_c;

import java.util.Scanner;

public class DigitSumAndNumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int remaining = number, sum = 0, reversed = 0;
        while (remaining > 0) {
            int digit = remaining % 10;
            sum += digit;
            reversed = reversed * 10 + digit;
            remaining /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reversed);
        sc.close();
    }
}