package week10_arrays;

public class BusiestBusRow {
    // Returns {rowIndex, totalStudents}. Ties go to the smaller row index.
    public static int[] busiestRow(int[][] grid) {
        int bestRow = 0, bestTotal = -1;
        for (int i = 0; i < grid.length; i++) {
            int total = 0;
            for (int seats : grid[i]) total += seats;
            if (total > bestTotal) {
                bestTotal = total;
                bestRow = i;
            }
        }
        return new int[]{bestRow, bestTotal};
    }

    public static void main(String[] args) {
        int[][] grid = {{2, 0, 1}, {3, 3, 1}, {1, 1, 1}};
        int[] result = busiestRow(grid);
        System.out.println("Row " + result[0] + ", Total " + result[1]);
    }
    // Time: O(r * c); extra working space: O(1), excluding the result array.
}