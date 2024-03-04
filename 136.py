# LeetCode 136: Single Number
# Reference: https://www.youtube.com/watch?v=qMPX1AOa83k

class Solution:
    def singleNumber(self, nums: List[int]) -> int:

        # Required: a linear runtime complexity and use only constant extra space.
        # XOR == Exclusive OR
        res = 0
        for n in nums:
            res = n ^ res
        return res
