package week12_practice;

import java.util.Scanner;

interface PaymentMode {
    double processPayment(double amount);
    double fee(double amount);
    String mode();
}

class CashPayment implements PaymentMode {
    public double processPayment(double amount) { return amount; }
    public double fee(double amount) { return 0.0; }
    public String mode() { return "Cash"; }
}

class CardPayment implements PaymentMode {
    public double processPayment(double amount) { return amount + fee(amount); }
    public double fee(double amount) { return amount * 0.02; }
    public String mode() { return "Card"; }
}

class UpiPayment implements PaymentMode {
    public double processPayment(double amount) { return amount; }
    public double fee(double amount) { return 0.0; }
    public String mode() { return "UPI"; }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PaymentMode[] payments = new PaymentMode[n];
        double[] amounts = new double[n];

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            amounts[i] = sc.nextDouble();
            if (mode.equalsIgnoreCase("Cash")) payments[i] = new CashPayment();
            else if (mode.equalsIgnoreCase("Card")) payments[i] = new CardPayment();
            else if (mode.equalsIgnoreCase("UPI")) payments[i] = new UpiPayment();
            else throw new IllegalArgumentException("Unknown payment mode: " + mode);
        }

        double total = 0;
        for (int i = 0; i < n; i++) {
            PaymentMode payment = payments[i];
            double fee = payment.fee(amounts[i]);
            double processed = payment.processPayment(amounts[i]);
            System.out.printf("%s: amount %.1f, fee %.1f, processed %.1f%n",
                    payment.mode(), amounts[i], fee, processed);
            total += processed;
        }
        System.out.printf("Total Amount Processed: %.1f%n", total);
        sc.close();
    }
    // Processing n payments: O(n) time; O(n) space for the payment array and amounts.
}