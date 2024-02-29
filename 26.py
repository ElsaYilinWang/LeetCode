# 26. Remove Duplicated from Sorted Array
# Reference: https://www.youtube.com/watch?v=DEJAZBq0FDA

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        l = 1  # l is left pointer

        for r in range(1, len(nums)): # r is right pointer
            if nums[r] != nums[r - 1]:
                nums[l] = nums[r]
                l += 1
        
        return l

