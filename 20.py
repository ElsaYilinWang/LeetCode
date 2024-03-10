# LeetCode 20: Valid Parentases
# Reference: https://www.youtube.com/watch?v=WTzjTskDFMg

class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        closeToOpen = {")": "(", "]": "[", "}": "{"}

        for c in s:
            if c in closeToOpen: # c is a closing parentasis
                if stack and stack[-1] == closeToOpen[c]:
                    stack.pop()
                else:
                    return False
                
            else: # c is an opening parentasis
                stack.append(c)

        return True if not stack else False