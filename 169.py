# Leetcode 169 Majority Element
# NeetCode solutions: https://www.youtube.com/watch?v=7pnhv842keE


class Solution:
    def majorityElement(self, nums: List[int]) -> int:

    # Solution1: HashMap
        count = {}
        res, maxCount = 0, 0

        for n in nums:
            if n not in count:
                count[n] = 1
            else:
                count[n] += 1
            
        # count[n] = 1 + count.get(n, 0)
            
            if maxCount < count[n]:
                maxCount = count[n]
                res = n
        
        return res
        

    def majorityElement2(self, nums: List[int]) -> int:

    # Solution2: Boyer-Moore Algorithm
        res, count = 0, 0

        for n in nums:
            if count == 0:
                res = n
            
            if n == res:
                count += 1
            else:
                count -= 1
        
        return res
    
    # Brute Force: See if the solution exists
    # Sorting: the majority element will always pass the mid point;
    # Quick Sort: Time Complexity O(N*logN)