package week1.assigment_problems;
public class TypingSpeedTestAccuracyChecker {
    public static void checkTypingAccuracy(String original, String typed) {
        int total = Math.max(original.length(), typed.length()), matched = 0, firstMismatch = -1;
        for (int i=0; i<Math.min(original.length(),typed.length()); i++) {
            if (original.charAt(i)==typed.charAt(i)) matched++;
            else if (firstMismatch==-1) firstMismatch=i;
        }
        if (original.length()!=typed.length() && firstMismatch==-1) firstMismatch=Math.min(original.length(),typed.length());
        double accuracy = total==0 ? 100.0 : matched*100.0/total;
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | ", matched,total,accuracy);
        if (firstMismatch==-1) System.out.println("No Mismatches");
        else {
            String a=firstMismatch<original.length() ? "'"+original.charAt(firstMismatch)+"'" : "<missing>";
            String b=firstMismatch<typed.length() ? "'"+typed.charAt(firstMismatch)+"'" : "<missing>";
            System.out.printf("First Mismatch at position %d (%s vs %s)%n",firstMismatch+1,a,b);
        }
    }
    public static void main(String[] args) { checkTypingAccuracy("hello world","hello worlt"); }
}