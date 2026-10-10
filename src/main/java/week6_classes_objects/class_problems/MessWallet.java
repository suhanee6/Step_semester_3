package week6_classes_objects.class_problems;
public class MessWallet {
 private double balance;
 public MessWallet(double opening){if(opening<0){System.out.println("Warning: negative opening balance; starting at 0");balance=0;}else balance=opening;}
 public void topUp(double amount){if(amount<=0)System.out.println("Top-up rejected: amount must be positive");else balance+=amount;}
 public void deduct(double amount){if(amount<=0)System.out.println("Deduct rejected: amount must be positive");else if(amount>balance)System.out.println("Deduct rejected: insufficient balance");else balance-=amount;}
 public double getBalance(){return balance;}
 public static void main(String[] args){MessWallet w=new MessWallet(500);w.topUp(200);System.out.println("Balance after top-up: "+w.getBalance());w.deduct(1000);System.out.println("Final balance: "+w.getBalance());}
}