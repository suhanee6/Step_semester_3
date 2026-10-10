package week7_encapsulation.class_problems;
public class PiggyBank {
 private final String id;private double savings;
 public PiggyBank(String id){this.id=id;savings=0;}
 public void deposit(double amount){if(amount<=0)System.out.println("Deposit rejected");else savings+=amount;}
 public void withdraw(double amount){if(amount<=0||amount>savings)System.out.println("Withdrawal rejected");else savings-=amount;}
 public double getSavings(){return savings;}public String getId(){return id;}
 public static void main(String[] args){PiggyBank p=new PiggyBank("PB-1");p.deposit(100);p.withdraw(30);p.withdraw(500);System.out.println(p.getId()+" savings: "+p.getSavings());}
}