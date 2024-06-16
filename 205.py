# LeetCode 205 Isomorphic Strings
# Reference: https://www.youtube.com/watch?v=7yF-U1hLEqQ

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapST, mapTS = {}, {}

        for c1, c2 in zip(s, t):
            if ((c1 in mapST and mapST[c1] != c2) or 
                (c2 in mapTS and mapTS[c2] != c1)):
                return False
        
        return True