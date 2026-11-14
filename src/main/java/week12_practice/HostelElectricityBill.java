package week12_practice;

import java.util.Scanner;

public class HostelElectricityBill {
    public static int calculateBill(int units) {
        if (units <= 100) return units * 3 + 50;
        if (units <= 200) return 100 * 3 + (units - 100) * 5 + 50;
        return 100 * 3 + 100 * 5 + (units - 200) * 8 + 50;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int roomsBilled = 0, total = 0;

        for (int i = 0; i < n; i++) {
            String room = sc.next();
            int units = sc.nextInt();
            if (units < 0) {
                System.out.println(room + ": invalid reading");
            } else {
                int bill = calculateBill(units);
                System.out.println(room + ": " + units + " units, bill " + bill);
                roomsBilled++;
                total += bill;
            }
        }
        System.out.println("Rooms billed " + roomsBilled + ", total " + total);
        sc.close();
    }
    // Billing n rooms: O(n) time; O(1) extra space.
}