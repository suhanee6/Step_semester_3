package week2.assigment_problems;
public class ATMPinLengthValidator {
 public static void checkPinLength(String pin){System.out.println(pin!=null&&pin.length()==4?"PIN length OK.":"Invalid PIN — must be exactly 4 digits.");}
 public static void main(String[] args){checkPinLength("4820");}
}