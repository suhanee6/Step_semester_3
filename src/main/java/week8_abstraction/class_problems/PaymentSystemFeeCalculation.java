package week8_abstraction.class_problems;
import java.util.*;
public class PaymentSystemFeeCalculation {
 interface Payment{double finalAmount();}
 record Card(double amount) implements Payment{public double finalAmount(){return amount*1.02;}}
 record Wallet(double amount) implements Payment{public double finalAmount(){return amount*1.01;}}
 record BankTransfer(double amount) implements Payment{public double finalAmount(){return amount;}}
 public static void main(String[] args){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next().toUpperCase();double a=s.nextDouble();Payment p=t.equals("CARD")?new Card(a):t.equals("WALLET")?new Wallet(a):new BankTransfer(a);double v=p.finalAmount();System.out.printf("%s: %.2f%n",t,v);total+=v;}System.out.printf("Total: %.2f%n",total);}
}