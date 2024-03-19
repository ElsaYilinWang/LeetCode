# LeetCode 206 Reverse Linked List
# Reference: https://www.youtube.com/watch?v=G0_I-ZF0S38

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        while head:
            temp = None
            temp = head
            head = head.next 
            head.next = temp
        head.tail.next = None

        return head
    
    def reverseList2(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # recursive: T O(n), S O(n)

        if not head:
            return None
        
        newHead = head
        if head.next:
            newHead = self.reverseList(head.next)
            head.next.next = head
        head.next = None

        return newHead

