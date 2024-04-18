# LeetCode 162 Find Peak element
# Reference: https://www.youtube.com/watch?v=kMzJy9es7Hc

class Solution:
    def findPeakElement(self, nums: List[int]) -> int:

        # O(logN): Binary Search
        # Need to modify a bit
        l, r = 0, len(nums) - 1

        while l <= r:
            m = l + ((r-1)//2) # avoid overflowing

            # left neighbor greater
            if m > 0 and nums[m] < nums[m-1]:
                r = m - 1
            # right neighbor greater
            elif m < len(nums) - 1 and nums[m] < nums[m+1]:
                l = m + 1
            else:
                return m
        