# LeetCode 274 H-index
# Reference: https://leetcode.com/problems/h-index/solutions/4928640/python-2-approaches-sorting-counting-summary-with-comparison/?envType=study-plan-v2&envId=top-interview-150

class Solution:
    def hIndex(self, citations: List[int]) -> int:
        n = len(citations)
        citations.sort()

        for i, v in enumerate(citations):
            if n - 1 <= v:
                return n - i
        return 0