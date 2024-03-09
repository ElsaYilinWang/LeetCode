# LeetCode 13 Roman to Integer
# Reference: https://www.youtube.com/watch?v=3jdxYj3DD98

class Solution:
    def romanToInt(self, s: str) -> int:
        # Largest to smallest: add them up
        # smaller before large: subtract smaller

        roman = {"I":1, "V":5, "X":10, "L":50, "C":100, "D":500, "M":1000}

        res = 0

        for i in range(len(s)):
            if i+1 < len(s) and roman[s[i]] < roman[s[i+1]]:
                res -= roman[s[i]]
            else:
                res += roman[s[i]]
        return res

        