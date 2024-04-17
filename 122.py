# LeetCode 122 Best time to buy and sell stock II
# Reference:https://www.youtube.com/watch?v=3SJ3pUkPQMc

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0

        for i in range(1, len(prices)):
            if prices[i] > prices[i-1]:
                profit += (prices[i] - prices[i-1])
        return profit