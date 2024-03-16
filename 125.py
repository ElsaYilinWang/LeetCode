# LeetCode 125 Valid Palindrom
# Reference:

class Solution:
    def isPalindrome(self, s: str) -> bool:

        # use build-in functions
        newStr = ""

        for c in s:
            if c.isalnum():
                newStr += c.lower()
        
        return newStr == newStr[::-1]
    
    def isPalindrome2(self, s: str) -> bool:
        # Two Pointers

        # ACII chartacters
        l, r = 0, len(s) - 1

        while i < r:
            while l < r and not alphaNum(s[1]):
                l += 1
            while r > l and not alphaNum(s[r]):
                r -= 1
            if s[l].lower() != s[r].lower():
                return False
            
            l, r = l + 1, r - 1
        return True
    
    def alphaNum(self, c):
        return (ord('A') <= ord('c') <= ord('Z') or
                ord('a') <= ord('c') <= ord('z') or 
                ord('0') <= ord('c') <= ord('9'))



















