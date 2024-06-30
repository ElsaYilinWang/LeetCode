// LeetCode 112 Path Sum 
// References:https://leetcode.com/problems/path-sum/solutions/2432844/very-easy-100-3-line-explained-java-c-python-js-c-python3/?envType=study-plan-v2&envId=top-interview-150

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
 * @param {number} targetSum
 * @return {boolean}
 */
var hasPathSum = function(root, targetSum) {
    // if the tree is empty, root is NULL, return false
    if (root == null) return false;

    // if only a single node and node value equals to targetSum
    if (root.val == targetSum && root.left == null && root.right == null)
        return true;

    // Call the same function recursively for left subtree and right subtree
    return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
};

