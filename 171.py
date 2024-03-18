# LeetCode 171 Excel Sheet Column Number
# Reference: https://leetcode.com/problems/excel-sheet-column-number/solutions/1790567/python3-clean-solution-explained/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        
        ans, pos = 0, 0
        for letter in reversed(columnTitle):
            digit = ord(letter) - 64
            ans += digit * 26 ** pos
            pos += 1
        
        return ans