package day1_live_coding.class_problems;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        return isPalindromeRecursive(text, 0, text.length() - 1);
    }

    private static boolean isPalindromeRecursive(String text, int left, int right) {
        if (left >= right) return true;
        if (text.charAt(left) != text.charAt(right)) return false;
        return isPalindromeRecursive(text, left + 1, right - 1);
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] chars = text.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) reversed[i] = chars[chars.length - 1 - i];
        return text.equals(new String(reversed));
    }

    private static String label(boolean result) {
        return result ? "Palindrome" : "Not Palindrome";
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = scanner.nextLine();
            System.out.println("Iterative: " + label(isPalindromeIterative(text))
                    + " | Recursive: " + label(isPalindromeRecursive(text))
                    + " | Array Reversal: " + label(isPalindromeArrayReversal(text)));
        }
    }
}