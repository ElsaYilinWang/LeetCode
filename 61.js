// LeetCode 61: Rotate List
// References:https://leetcode.com/problems/rotate-list/solutions/1838161/algo-explained-easy-js-97-fast-commented/?envType=study-plan-v2&envId=top-interview-150

/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var rotateRight = function(head, k) {
    if (!head) return head;
    let count = 0, ptr = head;

    // Step 1: count list nodes
    while (ptr) {
        count++;ptr = ptr.next;
    }

    // Step 2: Number of rotations are now restricted within limit
    k = k % count;
    let prev = head;
    ptr = head;

    //Step 3: Moving one pointer k positions ahead
	while (k--) {
		ptr = ptr.next;
	}

    //Step 4: The actual magic, explained above
	while (ptr.next) {
		prev = prev.next;
		ptr = ptr.next;
	}

    //Step 5: Simply modifying the head and last node
	ptr.next = head;
	head = prev.next;
	prev.next = null;
	return head;
};