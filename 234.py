# LeetCode 234 Palindrom Linked List
# Reference: https://www.youtube.com/watch?v=yOzXms1J6Nk

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        # Array solution
        nums = []

        while head:
            nums.append(head.val)
            head = head.next
        
        l, r = 0, len(nums) - 1
        while l <= r:
            if nums[l] != nums[r]:
                return False
            l += 1
            r -= 1
            return True
        
    def isPalindrome2(self, head: Optional[ListNode]) -> bool:
        # Two pointers - FAST & SLOW
        fast = head
        slow = head

        # find middle (slow)
        while fast and fast.next: # when fast is null or reaches the tail, break the loop
            fast = fast.next.next
            slow = slow.next

        # reverse second half
        prev = None
        while slow:
            tmp = slow.next
            slow.next = prev
            prev = slow
            slow = tmp
        
        # check palindrom
        left, right = head, prev
        while right:
            if left.val != right.val:
                return False
            left = left.next
            right = right.next
        return True



        