# Leetcode 82 Remove Duplicates from Sorted List II
# References: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/solutions/2419088/very-easy-100-fully-explained-java-c-python-js-c-python3/?envType=study-plan-v2&envId=top-interview-150


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        fake = ListNode(-1)
        fake.next = head
        # We use prev (for node just before duplications begins), curr (for the last node of the duplication group)...
        curr, prev = head, fake
        while curr:
            # while we have curr.next and its value is equal to curr...
            # It means, that we have one more duplicate...
            while curr.next and curr.val == curr.next.val:
                # So move curr pointer to the right...
                curr = curr.next
            # If it happens, that prev.next equal to curr...
            # It means, that we have only 1 element in the group of duplicated elements...
            if prev.next == curr:
                # Don't need to delete it, we move both pointers to right...
                prev = prev.next
                curr = curr.next
            # Otherwise, we need to skip a group of duplicated elements...
            # set prev.next = curr.next, and curr = prev.next...
            else:
                prev.next = curr.next
                curr = prev.next
        # Return the linked list...
        return fake.next

        