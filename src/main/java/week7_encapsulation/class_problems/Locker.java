package week7_encapsulation.class_problems;
public class Locker {
 private final int lockerNumber;private String combination;
 public Locker(int lockerNumber,String combination){this.lockerNumber=lockerNumber;this.combination=combination;}
 public boolean changeCode(String currentCode,String newCode){if(combination.equals(currentCode)){combination=newCode;System.out.println("Code changed");return true;}System.out.println("Change rejected");return false;}
 public int getLockerNumber(){return lockerNumber;}
 public static void main(String[] args){Locker l=new Locker(101,"1234");l.changeCode("1234","5678");l.changeCode("0000","9999");}
}