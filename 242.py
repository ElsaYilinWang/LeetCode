# LeetCode 242 Valid Anagram
# Reference: https://www.youtube.com/watch?v=9UtInBqnCgA

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        # HashMap solution:

        if len(s) != len(t):
            return False    # Edge case
        
        # Create hashMaps for s and t
        countS, countT = {}, {}

        # Fill value in hashMaps
        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(s[i], 0)
            countT[t[i]] = 1 + countS.get(t[i], 0)
        
        # Check
        for c in countS:
            if countS[c] != countT.get(c, 0): 
                # if c doesn't exit in countT, getValue is 0
                return False
            
        return True
    

    def isAnagram2(self, s: str, t: str) -> bool:

        # Sorting
        return sorted(s) == sorted(t)
    
      # return Counter(s) == Counter(t)