// LeetCode 121 Best time to buy and Sell stock
// Reference: https://www.youtube.com/watch?v=E2-heUEnZKU

class Solution {
    public int maxProfit(int[] prices) {
        // at the beginning, the minimum is the first price
        int buy_price = prices[0];

        // at the beginning, the profit is 0
        int profit = 0;

        for (int i = 0; i < prices.length; i++){
            //if the current price is less, update buy_price
            if (buy_price > prices[i]){

                buy_price = prices[i];

            } else {
                //check if we get a better profit
                int current_profit = prices[i] - buy_price;
                profit = Math.max(current_profit, profit);
            }
        }
        return profit;
    }
}