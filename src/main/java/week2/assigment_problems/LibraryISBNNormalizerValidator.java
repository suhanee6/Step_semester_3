package week2.assigment_problems;
public class LibraryISBNNormalizerValidator {
 public static String normalizeCode(String raw){String s=raw.trim();return s.length()<3?s.toUpperCase():s.substring(0,3).toUpperCase()+s.substring(3);}
 public static String validateAndFormat(String code){
  if(code.length()!=13)return "Invalid: wrong length";
  for(int i=0;i<3;i++)if(!Character.isLetter(code.charAt(i)))return "Invalid: publisher code must be 3 letters";
  for(int i=3;i<13;i++)if(!Character.isDigit(code.charAt(i)))return "Invalid: body must contain only digits";
  return new StringBuilder().append('[').append(code,0,3).append("] YEAR: ").append(code,3,7).append(" | CATALOG: ").append(code,7,13).toString();
 }
 public static void main(String[] args){System.out.println(validateAndFormat(normalizeCode(" pen2026004251 ")));}
}