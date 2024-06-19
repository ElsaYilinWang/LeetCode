# LeetCode 228 Summary Ranges
# Reference:https://leetcode.com/problems/summary-ranges/solutions/1805476/python-simple-python-solution-using-iterative-approach-o-n/?envType=study-plan-v2&envId=top-interview-150

class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        result = []

        start, end = 0, 0

        while start < len(nums) and end < len(nums):
            if (end + 1) < len(nums) and nums[end] + 1 == nums[end + 1]:
                end = end + 1
            
            else:
                if nums[start] == nums[end]:
                    result.append(str(nums[start]))
                    start = start + 1
                    end = end + 1
                
                else:
                    result.append(str(nums[start]) + '->' + str(nums[end]))
                    end = end + 1
                    start = end
            return result