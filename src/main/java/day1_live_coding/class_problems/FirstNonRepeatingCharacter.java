package day1_live_coding.class_problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> frequency = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency.get(ch) == 1) return ch;
        }
        return '\0';
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = scanner.nextLine();
            char result = findFirstNonRepeatingChar(text);
            if (result == '\0') System.out.println("No Non-Repeating Character Found");
            else System.out.println("First Non-Repeating Character: '" + result + "'");
        }
    }
}