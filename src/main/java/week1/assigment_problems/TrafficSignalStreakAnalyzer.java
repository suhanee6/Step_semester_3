package week1.assigment_problems;
public class TrafficSignalStreakAnalyzer {
    public static void findLongestStreak(String signalLog) {
        if (signalLog==null || signalLog.isEmpty()) { System.out.println("No Signal Readings"); return; }
        char best=signalLog.charAt(0), current=best; int bestCount=1,count=1;
        for(int i=1;i<signalLog.length();i++) {
            char ch=signalLog.charAt(i);
            if(ch==current) count++; else { current=ch; count=1; }
            if(count>bestCount) { bestCount=count; best=current; }
        }
        System.out.printf("Longest Streak: '%c' repeated %d times%n",best,bestCount);
    }
    public static void main(String[] args) { findLongestStreak("RRGGGYRR"); }
}