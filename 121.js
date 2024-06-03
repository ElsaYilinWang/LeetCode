// LeetCode 121 Best time to buy and Sell stock
// Reference: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solutions/1735550/python-javascript-easy-solution-with-very-clear-explanation/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let left = 0; // Buy
    let right = 1; // Sell
    let max_profit = 0;
    while (right < prices.length){
        if (prices[left] < prices[right]){
            let profit = prices[right] - prices[left];
            // Our current profit

            max_profit = Math.max(max_profit, profit);
        } else {
            left = right;
        }

        right ++;
    }
    return max_profit;
    
};