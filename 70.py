# LeetCode 70 Climbing Stairs
# Reference: https://www.youtube.com/watch?v=Y0lT9Fck7qI

# Dynamic Programming - Bottom up

class Solution:
    def climbStairs(self, n: int) -> int:
        one, two = 1, 1

        for i in range(n-1):
            temp = one
            two = one + two
            one = temp
        
        return one
        