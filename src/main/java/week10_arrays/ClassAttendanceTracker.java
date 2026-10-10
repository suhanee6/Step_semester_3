package week10_arrays;

public class ClassAttendanceTracker {
    public static int[] attendanceSummary(int[] days) {
        int present = 0, currentStreak = 0, longestStreak = 0;
        for (int day : days) {
            if (day == 1) {
                present++;
                currentStreak++;
                longestStreak = Math.max(longestStreak, currentStreak);
            } else {
                currentStreak = 0;
            }
        }
        return new int[]{present, longestStreak};
    }

    public static void main(String[] args) {
        int[] result = attendanceSummary(new int[]{1, 1, 0, 1, 1, 1, 0, 1});
        System.out.println("Present: " + result[0] + ", Longest streak: " + result[1]);
        int[] noAttendance = attendanceSummary(new int[]{0, 0, 0});
        System.out.println("Present: " + noAttendance[0] + ", Longest streak: " + noAttendance[1]);
    }
    // Time: O(n); extra space: O(1), excluding the two-value result array.
}