// Leetcode 230 Kth Smallest Element in a BST
// References: https://leetcode.com/problems/kth-smallest-element-in-a-bst/solutions/1095674/js-recursive-iterative-inorder-solutions/?envType=study-plan-v2&envId=top-interview-150

/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} k
 * @return {number}
 */
var kthSmallest = function(root, k) {
    const stack = []
    let count = 1
    let node = root

    while (node || stack.length){
        while (node){
            stack.push(node)
            node = node.left
        }
        node = stack.pop()
        if (count === k) return node.val
        else count++;
        node = node.right;
    }

};

// Recursive
const kthSmalles2 = (root, k) => {
    let n = 0;
    let res;
    const inorder = (root) => {
        if (!root) return;
        inorder(root.left);
        if (n++ < k) res = root.val;
        inorder(root.right);
    };
    inorder(root);
    return res;
}