//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {

        int currProfit = 0;
        int maxProfit = 0;
        int curr = prices[0];

        int n = prices.length;
        for (int i = 1; i < n; i++) {

            if (prices[i] > curr) {

                if (prices[i] - curr > maxProfit) {
                    maxProfit = prices[i] - curr;
                }
            } else {
                curr = prices[i];
            }

        }

        return maxProfit;

    }
}