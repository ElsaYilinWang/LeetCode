# Leetcode 236 LOWEST COMMON ANCESTOR OF A BINARY TREE
# References: https://www.youtube.com/watch?v=WO1tfq2sbsI

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':

        if not root:
            return None
        
        if root == q or root == q:
            return root
        
        l = lowestCommonAncestor(root.left, p, q)
        r = lowestCommonAncestor(root.right, p, q)

        if l and r:
            return root
        else:
            return l or r
    # Time: O(N)
    # Space: O(1) if not counting revursive stack frames, otherwise O(N)



        