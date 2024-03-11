# Leetcode 28 Find the Index of the First Occurrence in a String
# Reference: https://www.youtube.com/watch?v=Gjkhm1gYIMw

class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if needle == "":
            return 0
        
        for i in range(ken(haystack) + 1 - len(needle)):
            if haystack[i: i + len(needle)] == needle:
                return i
        
        return -1

