class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        for(int s = 0; s < prices.length; s++){
            for(int l = s; l < prices.length; l++){
                profit = prices[l] -prices[s];
                if (profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}