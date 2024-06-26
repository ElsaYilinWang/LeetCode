// LeetCode 104 Maximum Depth of Binary Tree
// Reference:https://leetcode.com/problems/maximum-depth-of-binary-tree/solutions/279066/two-easy-solution-using-javascript/?envType=study-plan-v2&envId=top-interview-150

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
var maxDepth = function(root) {
    // Non-recursive
    if (!root) return 0;

    const queue = [root];
    let depth = 0;
    while (queue.length !== 0) {
        depth++;
        const len = queue.length;
        for (let i = 0; i < len; i++){
            if (queue[i].left) 
                queue.push(queue[i].left);
            if (queue[i].right) 
                queue.push(queue[i].left);
        }
        queue.splice(0, len);
    }
    return depth;
};

var maxDepth2 = function(root) {
    if (!root) return 0;
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
};