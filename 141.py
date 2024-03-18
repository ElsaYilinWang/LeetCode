# 141 Linked List Cycle
# Reference: https://www.youtube.com/watch?v=gBTe7lFR3vc

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
    
        # Solution: Floyd's Tortoise and Hare
        slow, fast = head, head

        while fast and fast.next: # fast is not null, fast.next is not null
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return True
        
        return False

        # Time: O(n), Space O(1)
    
    # Solution HashSet Time O(n) Space O(n)
    def hasCycle2(self, head: Optional[ListNode]) -> bool:
        visited_nodes = set()
        current_node = head

        while current_node: # current_node is not null
            if current_node in visited_nodes:
                return True
            visited_nodes.add(current_node)
            current_node = current_node.next
        return False