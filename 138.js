// LeetCode 138 Copy List with Random Pointer
// References:https://leetcode.com/problems/copy-list-with-random-pointer/solutions/4003262/97-92-hash-table-linked-list/?envType=study-plan-v2&envId=top-interview-150

/**
 * // Definition for a _Node.
 * function _Node(val, next, random) {
 *    this.val = val;
 *    this.next = next;
 *    this.random = random;
 * };
 */

/**
 * @param {_Node} head
 * @return {_Node}
 */
var copyRandomList = function(head) {
    if (! head) return null;

    const oldToNew = new Map();

    let curr = head;

    while (curr) {
        oldToNew.set(curr, new Node(curr.val));
        curr = curr.next;
    }

    curr = head;
    while (curr) {
        oldToNew.get(curr).next = oldToNew.get(curr.next) || null;
        oldToNew.get(curr).random = oldToNew.get(curr.random) || null;
        curr = curr.next;

    }
    return oldToNew.get(head);
};