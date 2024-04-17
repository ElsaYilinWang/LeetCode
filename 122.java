// LeetCode 122 Best time to buy and sell stock II
// Reference: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/solutions/4053621/beginner-friendly-solution-beats-100/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public int maxProfit(int[] prices) {
        int profit= 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
