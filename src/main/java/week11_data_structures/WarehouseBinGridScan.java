package week11_data_structures;

public class WarehouseBinGridScan {
    // Returns {totalItems, maxRow, maxColumn}; ties keep the first cell in row-major order.
    public static int[] warehouseSummary(int[][] grid) {
        int total = 0, maxValue = -1, maxRow = -1, maxColumn = -1;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                int value = grid[row][column];
                total += value;
                if (value > maxValue) {
                    maxValue = value;
                    maxRow = row;
                    maxColumn = column;
                }
            }
        }
        return new int[]{total, maxRow, maxColumn};
    }

    public static void main(String[] args) {
        int[][] grid = {{4, 9, 2}, {7, 1, 6}, {3, 12, 5}};
        int[] result = warehouseSummary(grid);
        System.out.println("total = " + result[0] + ", maxCoordinate = (" +
                result[1] + ", " + result[2] + ")");
    }
    // Time: O(m * n); extra space: O(1), excluding the result array.
}