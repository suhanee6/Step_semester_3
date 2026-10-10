package day2_live_coding.class_problems;
public class BankTransactionReferenceValidator {
 public static String normalizeReference(String raw){String s=raw.trim(); if(s.length()<3)return s.toUpperCase(); return s.substring(0,3).toUpperCase()+s.substring(3);}
 public static String validateAndFormat(String reference) {
  if(reference.length()!=14)return "Invalid: wrong length";
  for(int i=0;i<3;i++)if(!Character.isLetter(reference.charAt(i)))return "Invalid: bank code must be 3 letters";
  for(int i=3;i<14;i++)if(!Character.isDigit(reference.charAt(i)))return "Invalid: body must contain only digits";
  String date=reference.substring(3,9), seq=reference.substring(9);
  return new StringBuilder().append('[').append(reference,0,3).append("] DATE: ")
    .append(date,0,2).append('/').append(date,2,4).append('/').append(date,4,6)
    .append(" | SEQ: ").append(seq).toString();
 }
 public static void main(String[] args){System.out.println(validateAndFormat(normalizeReference(" hdf03022600042 ")));}
}