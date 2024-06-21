// LeetCode 141 Linked List Cycle
// Reference:https://leetcode.com/problems/linked-list-cycle/solutions/1829768/javascript-easy-to-understand-slow-fast-pointers-detailed-explanation/?envType=study-plan-v2&envId=top-interview-150

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {

    let fast = head;

    while (fast && fast.next){

        head = head.next;
        fast = fast.next.next;
        
        if (head === fast) return true;

    }
    return false;
    
};