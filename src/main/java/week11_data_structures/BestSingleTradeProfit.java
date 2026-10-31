package week11_data_structures;

public class BestSingleTradeProfit {
    public static int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int minimumPrice = prices[0], bestProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            bestProfit = Math.max(bestProfit, prices[i] - minimumPrice);
            minimumPrice = Math.min(minimumPrice, prices[i]);
        }
        return bestProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1})); // 0
    }
    // Time: O(n); extra space: O(1).
}