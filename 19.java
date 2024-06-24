// LeetCode 19: Remove Nth Node from End of List
// References:https://leetcode.com/problems/remove-nth-node-from-end-of-list/solutions/589304/clear-java-solution-with-detailed-explanation/?envType=study-plan-v2&envId=top-interview-150

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // start is a dummy node before head
        ListNode start = new ListNode(0);
        // Two pointers slow and fast
        ListNode slow = start, fast = start;
        start.next = head;

        for (int i = 1; i <= n + 1; i++){
            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }
}