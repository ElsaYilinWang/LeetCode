# Leetcode 69 Sqrt(x)
# Reference: https://www.youtube.com/watch?v=zdMhGxRWutQ

class Solution:
    def mySqrt(self, x: int) -> int:
        # Binary Search
        l, r = 0, x
        res = 0

        while l <= r:
            m = l + ((r - 1)//2) # to prevent overflow

            if m ** 2 > x: # if the mid point is too large, go to the left half
                r = m - 1
            elif m ** 2 < x: # if the mid point is too small, go to the right half
                l = m + 1
                res = m # a ppotential candidate
            else:
                return m
            
        return res
        
