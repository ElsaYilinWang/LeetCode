# LeetCode 94 Binary Tree Inorder Traversal
# Reference:

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        
        # Recursive
        res = []

        def inorder(root):
            if not root:
                return
            
            inorder(root.left)
            res.append(root.val)
            inorder(root.right)
        
        inorder(root)
        return res
    
    def inorderTraversal2(self, root: Optional[TreeNode]) -> List[int]:

        # Iterative
        res = []
        stack = []
        cur = root

        while cur or stack:
            while cur:  # cur is not null
                stack.append(cur)
                cur = cur.left

            cur = stack.pop()
            res.append(cur)
            cur = cur.right
        return res
