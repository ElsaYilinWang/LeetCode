# LeetCode 387 First Unique Character in a String
# Reference: https://www.youtube.com/watch?v=rBENYgWy3xU

class Solution:
    def firstUniqChar(self, s: str) -> int:
        count = defaultdict(int) # char -> count

        for c in s:
            count[c] += 1

        for i, c in enumerate(s): # enumerate(iterable, start=0)
            if count[c] == 1:
                return i
        
        return -1