# Leetcode 55 Jump Game
# Reference: https://www.youtube.com/watch?v=Yan0cv2cLy8

class Solution:
    def canJump(self, nums: List[int]) -> bool:
        # Greedy
        # Time O(n)
        goal = len(nums) - 1

        for i in range(len(nums)-1, -1, -1):
            if i + nums[i] >= goal:
                goal = i
        return True if goal == 0 else False