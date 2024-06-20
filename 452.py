# LeetCode 452 Minimum Number of Arrows to Burst Balloons
# Reference:https://www.youtube.com/watch?v=lPmkKnvNPrw

class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        points.sort()

        res = len(points)
        prev = points[0]

        for i in range(1, len(points)):
            curr = points[i]
            if curr[0] <= prev[1]:
                res -= 1
                prev = [curr[0], min(curr[i], prev[1])]
            else:
                prev = curr
        return res