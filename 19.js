// LeetCode 19: Remove Nth Node from End of List
// References:https://leetcode.com/problems/remove-nth-node-from-end-of-list/solutions/4813340/beat-100-00-full-explanation-with-pictures/?envType=study-plan-v2&envId=top-interview-150

/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    const dummy = new ListNode(0);
    dummy.next = head;
    let first = dummy;
    let second = dummy;

    for (let i = 0; i <= n; i++){
        first = first.next;
    }

    while (first !== null){
        first = first.next;
        second = second.next;
    }

    second.next = second.next.next;

    return dummy.next;
};