# LeetCode 268 Missing Number

class Solution:
    def missingNumber(self, nums: List[int]) -> int:

        # HashSet solution: TC O(n) SC O(n)
        hs = set()
        for i in range(0, len(nums) + 1):
            hs.add(i)
        
        for n in nums:
            if n in hs:
                hs.remove(n)

        return hs.pop()

# Reference: https://www.youtube.com/watch?v=WnPLSRLSANE
    
    def missingNumber2(self, nums: List[int]) -> int:
        res = len(nums)

        for i in range(len(nums)):
            res += (i - nums[i])
        
        return res

    
    