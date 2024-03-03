# LeetCode 283 Move Zeroes
# Reference: https://www.youtube.com/watch?v=aayNRwUN3Do

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # QuickSort
        l = 0
        for r in range(len(nums)):
            if nums[r]: # nums[r] == 0
                nums[l], nums[r] = nums[r], nums[l]
                l += 1
        return nums
        
#  Time Complexity is O(N) and Space Complexity is O(1)
