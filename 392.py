# LeetCode 392 Is Subsequence
# Reference: https://www.youtube.com/watch?v=99RVfqklbCE

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i, j = 0, 0

        while i < len(s) and j < len(t):
            if s[i] == t[j]:
                i += 1
            j += 1
        
        return True if 1 == len(s) else False