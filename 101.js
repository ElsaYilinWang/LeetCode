// LeetCode 101 Symmetric Tree
// Reference:https://leetcode.com/problems/symmetric-tree/solutions/494632/javascript-95-speed-100-memory-w-comments/?envType=study-plan-v2&envId=top-interview-150

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
 * @return {boolean}
 */
var isSymmetric = function(root) {

    if (root == null) return true;

    return symmetryChecker(root.left, root.right);
    
};

function symmetryChecker(left, right){
    // If both sub trees are empty
    if (left == null && right == null) return true;
    // If only one of the sub trees are empty
    if (left == null || right == null) return false;
    // If the values dont match up
    if (left.val != right.val) return false;

    // Check both subtrees but travelled in a mirrored/symmetric fashion
	// (one goes left, other goes right)  and make sure they're both symmetric

    return symmetryChecker(left.left, right.right) && symmetryChecker(left.right, right.left);
}