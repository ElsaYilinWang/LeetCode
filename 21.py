# LeetCode 21 Merge Two sorted Lists
# Reference: https://www.youtube.com/watch?v=XIdigk956u0

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        tail = dummy

        while list1 and list2: # l1 and l2 both are not empty
            if list1.val < list2.val:
                tail.next = list1
                list1 = list1.next
            else:
                tail.next = list2
                list2 = list2.next

            tail = tail.next
        
        if list1: # list2 is empty, list1 is not
            tail.next = list1
        elif list2: # list1 is empty, list2 is not
            tail.next = list2
        
        return dummy.next




        
        