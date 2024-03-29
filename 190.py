# LeetCode 190 Reverse Bits
# Reference: https://www.youtube.com/watch?v=UcoN6UjAI64

class Solution:
    def reverseBits(self, n: int) -> int:
        res = 0

        for i in range(32):
            bit = (n >> i) & i
            res = res | (bit << (31 - i))
        return res