# Leetcode 117 Populating Next Right Pointers in Each Node II
# References:https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/solutions/2033286/python-easy-bfs-and-o-1-space-with-explanation/?envType=study-plan-v2&envId=top-interview-150

"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Node') -> 'Node':
        if not root:
            return None
        q = deque()
        q.append(root)
        dummy = Node(-999) # to initialize with a not null prev
        while q:
            length = len(q) # find level length

            prev = dummy

            for _ in range(length): # iterate through all nodes in the same level
                popped = q.popleft()
                if popped.left:
                    q.append(popped.left)
                    prev.next = popped.left
                    prev = prev.next
                if popped.right:
                    q.append(popped.right)
                    prev.next = popped.right
                    prev = prev.next
            return root
