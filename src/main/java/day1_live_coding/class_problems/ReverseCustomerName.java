package day1_live_coding.class_problems;

import java.util.Scanner;

public class ReverseCustomerName {
    public static String reverseCustomerName(String customerName) {
        char[] characters = customerName.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = characters.length - 1; i >= 0; i--) reversed.append(characters[i]);
        return reversed.toString();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();
            System.out.println("Original Name: " + name);
            System.out.println("Reversed Name: " + reverseCustomerName(name));
        }
    }
}