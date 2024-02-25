# LeetCode 217 Contains Duplicate
# NeetCode: https://www.youtube.com/watch?v=3OamzN90kPg


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:

        # HashMap: Time Complexity O(n) Space Complexity: O(n)
        count = {}

        for n in nums:
            if n not in count:
                count[n] = 1
            else:
                count[n] += 1

                if count[n] == 2:
                    return True
        return False
    
        # Brute Force: Time ~ O(n*2), Space ~ O(1)
        # Sorting : Time ~ O(n*logn), Space ~ O(1)
    
    def containsDuplicate2(self, nums: List[int]) -> bool:
        # HashSet: Time Complexity ~ O(n), Space ~ O(n)
        hashSet = set()

        for n in nums:
            if n in hashSet:
                return True
            
            hashSet.add(n)
        return False
        

