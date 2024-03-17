# LeetCode 101 Symmetric Tree
# Reference: https://www.youtube.com/watch?v=Mao9uzxwvmc


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        def dfs(left, right):
            if not left and not right: # both nodes are null
                return True
            if not left or not right: # only one node is null
                return False
            
            return (left.val == right.val and dfs(left.left, right.right) and dfs(left.right, right.left))
        
        return dfs(root.left, root.right)  























        
