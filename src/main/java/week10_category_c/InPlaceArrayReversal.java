package week10_category_c;

import java.util.Arrays;

public class InPlaceArrayReversal {
    public static void reverse(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44};
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    // Time: O(n); extra space: O(1).
}