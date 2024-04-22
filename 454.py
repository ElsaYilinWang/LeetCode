# LeetCode 454 4Sum II
# Reference: https://leetcode.com/problems/4sum-ii/solutions/1741072/python-clean-and-concise-detail-explanation-one-linear/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution:
    def fourSumCount(self, nums1: List[int], nums2: List[int], nums3: List[int], nums4: List[int]) -> int:
        
        # hashmap and final result count
        nums12, res = defaultdict(int), 0

        # storing all possible combinations of sum
        for i in nums1:
            for j in nums2:
                nums12[i+j] += 1
        
        # iterating the left out two arrays to find negation of same value
        for k in nums3:
            for l in nums4:
                res += nums12[-(k+l)]
        
        return res