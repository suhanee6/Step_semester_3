package day2_live_coding.class_problems;
public class VowelConsonantCounter {
 public static void countVowelsAndConsonants(String text) {
  int vowels=0, consonants=0;
  for(int i=0;i<text.length();i++){char c=Character.toLowerCase(text.charAt(i)); if(c==' ')continue;
   if("aeiou".indexOf(c)>=0)vowels++; else if(Character.isLetter(c))consonants++;}
  System.out.printf("Vowels: %d | Consonants: %d%n",vowels,consonants);
 }
 public static void main(String[] args){countVowelsAndConsonants("Java Programming");}
}