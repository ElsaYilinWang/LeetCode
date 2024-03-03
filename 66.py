# LeetCode 66 Plus One
# Reference: https://www.youtube.com/watch?v=jIaA8boiG1s

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:

        # Reverse the list
        digits = digits[::-1]
        one, i = 1, 0

        while one == 1:
            if i < len(digits):
                if digits[i] == 9:
                    digits[i] = 0
                else:
                    digits[i] += 1
                    one = 0

            else:
                digits.append(one)
                one = 0

            i += 1

        return digits[::-1]



