// Leetcode 129 Sum Root to Leaf Numbers 
// References:https://leetcode.com/problems/sum-root-to-leaf-numbers/solutions/5025151/sum-root-to-leaf-numbers-beated-of-the-users/?envType=study-plan-v2&envId=top-interview-150

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
 * @return {number}
 */
var sumNumbers = function(root) {
    let ans = 0;

    const dfs = (node, path) => {
        if (!node) return;
        if (!node.left && !node.right){
            ans += path * 10 + node.val;
            return;
        }
        dfs(node.left, path * 10 + node.val);
        dfs(node.right, path * 10 + node.val);
    }
    dfs(root, 0);
    return ans;
};