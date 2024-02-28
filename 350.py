# LeetCode 350 Intersection of Two Arrays II
# Reference: https://www.youtube.com/watch?v=ctOkl71esQg

from collections import Counter


class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:

        # HashMap solution:
        c = Counter(nums1)
        output = []

        for n in nums2:
            if c[n] > 0:
                output.append(n)
                c[n] -= 1
        
        return output
    
    def intersect2(self, nums1: List[int], nums2: List[int]) -> List[int]:

        # Sorted nusm1 and nums2
        nums1, nums2 = sorted(nums1), sorted(nums2)
        output = []

        # 2 pointers
        i, j = 0, 0
        while i < len(nums1) and j < len(nums2):
            if nums1[i] < nums2[j]:
                i += 1
            elif nums1[i] > nums2[j]:
                j += 1
            else:
                output.append(nums1[i])
        
        return output


