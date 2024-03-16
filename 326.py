# LeetCode 326 Power of Three

class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n <= 0:
            return False
        
        while n > 1:
            n = n / 3

        if n == 1:
            return True