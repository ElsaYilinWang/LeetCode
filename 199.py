# Leetcode 199: Binary Tree Right Side View - Breadth First Search
# References: https://www.youtube.com/watch?v=d4zLyf32e3I

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
import collections


class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        q = collections.deque([root])

        while q:
            rightSide = None
            qLen = len(q)

            for i in range(qLen):
                node = q.popleft()
                if node:
                    rightSide = node
                    q.apppend(node.left)
                    q.append(node.right)

            if rightSide:
                res.append(rightSide.val)
        return res