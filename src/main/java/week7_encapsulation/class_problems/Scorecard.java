package week7_encapsulation.class_problems;
public class Scorecard {
 private final boolean[] results;private int recorded;
 public Scorecard(int questionCount){if(questionCount<0)throw new IllegalArgumentException();results=new boolean[questionCount];}
 public void recordAnswer(boolean correct){if(recorded>=results.length){System.out.println("All questions already recorded");return;}results[recorded++]=correct;}
 public int getScore(){int score=0;for(int i=0;i<recorded;i++)if(results[i])score++;return score;}
 public static void main(String[] args){Scorecard s=new Scorecard(4);s.recordAnswer(true);s.recordAnswer(true);s.recordAnswer(false);s.recordAnswer(true);System.out.println(s.getScore());}
}