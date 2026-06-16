import java.util.*;

class BuyAndSellStock {
    static public int know(int[] prices) {
        int ans = 0, small = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (small > prices[i]) {
                small = prices[i];
            } else {
                ans = (prices[i] - small > ans) ? (prices[i] - small) : (ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 4, 6 };
        int maxProfit = know(prices);
        System.out.println(maxProfit);
    }
}