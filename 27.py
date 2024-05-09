# Leetcode 27: Remove element
# Reference: https://www.youtube.com/watch?v=Pcd1ii9P9ZI

class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k = 0

        for i in range(len(nums)):
            if nums[i] != val:
                nums[k] = nums[i]
                k += 1
        return k