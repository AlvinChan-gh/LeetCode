class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        int i = 1;
        int low = prices[0];
        while (i < prices.length){
            profit = prices[i] - low;
            if (profit < 0){
                low = prices[i];
            }
            if (profit > maxProfit){
                maxProfit = profit;
            }
            i++;
        }
        return maxProfit;
    }
}