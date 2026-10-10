package week6_classes_objects.assigment_problems;
public class PayrollAccount {
 private double basicSalary,bonus;
 public PayrollAccount(double opening){if(opening<0){System.out.println("Warning: negative salary; starting at 0");basicSalary=0;}else basicSalary=opening;}
 public void creditBonus(double amount){if(amount<=0)System.out.println("Bonus rejected");else{bonus+=amount;System.out.println("Bonus credited: Rs "+amount);}}
 public void deductTax(double percent){if(percent<0||percent>100)System.out.println("Invalid tax percentage");else{basicSalary-=basicSalary*percent/100;System.out.println("Tax deducted: "+percent+"%");}}
 public double getNetSalary(){return basicSalary+bonus;}
 public static void main(String[] args){PayrollAccount p=new PayrollAccount(50000);p.creditBonus(5000);p.deductTax(10);System.out.println("Net salary: Rs "+p.getNetSalary());}
}