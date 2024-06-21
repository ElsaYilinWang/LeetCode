// LeetCode 141 Linked List Cycle
// Reference: https://leetcode.com/problems/linked-list-cycle/solutions/3999014/99-68-two-pointer-hash-table/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Hash Table Method

        // Create 2 pointers
        ListNode slow_pointer = head, fast_pointer = head;

        while(fast_pointer != null && fast_pointer.next != null){
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
            
            // 2 pointers meet at the visited node
            if(slow_pointer == fast_pointer){
                return true;
            }
        }
        return false;

    }

    public boolean hasCycle2(ListNode head) {
        HashSet<ListNode> visited_nodes = new HashSet<>();
        ListNode current_node = head;
        while (current_node != null) {
            if (visited_nodes.contains(current_node)) {
                return true;
            }
            visited_nodes.add(current_node);
            current_node = current_node.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
    val = x;
    next = null;
        }
     }