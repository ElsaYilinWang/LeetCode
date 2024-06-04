// LeetCode 122 Best time to buy and sell stock II
// Reference: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/solutions/376873/javascript-easy-understand/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {

    let profit = 0;

    for (let i = 1; i < prices.length; i++){
        let prev = prices[i - 1];
        let current = prices[i];

        if (prev < current) {
            profit += current - prev;
        }
    }
    return profit;
    
};