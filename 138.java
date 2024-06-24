// LeetCode 138 Copy List with Random Pointer
// References:https://leetcode.com/problems/copy-list-with-random-pointer/solutions/4003262/97-92-hash-table-linked-list/?envType=study-plan-v2&envId=top-interview-150


/* 
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

import java.util.HashMap;


class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> oldToNew = new HashMap<>();

        Node curr = head;
        while (curr != null){
            oldToNew.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null){
            oldToNew.get(curr).next = oldToNew.get(curr.next);
            oldToNew.get(curr).random = oldToNew.get(curr.random);
            curr = curr.next;
        }
        return oldToNew.get(head);
        
    }
}