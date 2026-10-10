package week2.assigment_problems;
import java.util.*;
public class StopWordFilteredWordFrequency {
 public static void printFilteredWordFrequency(String feedback){
  Set<String> stop=new HashSet<>(Arrays.asList("the","was","and","a","is","of","in"));
  Map<String,Integer> freq=new HashMap<>();
  String cleaned=feedback.toLowerCase().replace(".","").replace(",","").replace("!","").replace("?","");
  for(String word:cleaned.trim().split("\\s+"))if(!word.isEmpty()&&!stop.contains(word))freq.put(word,freq.getOrDefault(word,0)+1);
  List<Map.Entry<String,Integer>> entries=new ArrayList<>(freq.entrySet());
  entries.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));
  for(Map.Entry<String,Integer> e:entries)System.out.println(e.getKey()+": "+e.getValue());
 }
 public static void main(String[] args){printFilteredWordFrequency("The mentor was great, the session was great and clear.");}
}