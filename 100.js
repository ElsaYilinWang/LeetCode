// LeetCode 100 Same Tree
// References:https://leetcode.com/problems/same-tree/solutions/4782659/beats-100-users-c-java-python-javascript-explained/?envType=study-plan-v2&envId=top-interview-150

/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
var isSameTree = function(p, q) {
    if (!p && !q) return true;
    if (!p || !q) return false;

    return p.val === q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
};