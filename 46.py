# LeetCode 46 Permutations
# Reference: https://www.youtube.com/watch?v=s7AvT7cGdSo

class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result = []

        # base case
        if (len(nums) == 1):
            return [nums[:]]

        for i in range(len(nums)):
            n = nums.pop(0)
            perms = self.permute(nums)

            for perm in perms:
                perm.append(n)
            result.extend(perms)
            nums.append(n)
        
        return result

