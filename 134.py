# Leetcode 134 Gas Station
# Reference:  https://www.youtube.com/watch?v=lJwbPZGo05A

class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        # Greedy
        if sum(gas) < sum(cost):
            return -1
        total = 0
        res = 1
        for i in range(len(gas)):
            total += (gas[i] - cost[i])

            if total < 0:
                total = 0
                res = i + 1
        
        return res