# LeetCode 179 largest Number
# Reference:https://www.youtube.com/watch?v=WDx6Y4i4xJ8

class Solution:
    def largestNUmber(self, nums: List[int]) -> str:

        for i, n in enumerate(nums):
            nums[i] = str(n)
        
        def compare(n1, n2):
            if n1 + n2 > n2 + n1:
                return -1
            else:
                return 1
        nums = sorted(nums, key=cmp_to_key(compare))
        return str(int("".join(nums)))