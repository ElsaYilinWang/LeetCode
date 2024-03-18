# 160 Intersection of Two Linked Lists
# Reference: https://www.youtube.com/watch?v=D0X0BONOQhI

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        # HashSet solution
        hs = set()
        PA = headA
        PB = headB
        while PA: # headA not null
            if PA not in hs:
                hs.add(PA)
            PA = PA.next
        
        while PB: # headB not null
            if PB in hs:
                return PB
            PB = PB.next
        return None
    
    def getIntersectionNode2(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        l1, l2 = headA, headB

        while l1 != l2:
            l1 = l1.next if l1 else headB
            l2 = l2.next if l2 else headA
        
        return l1