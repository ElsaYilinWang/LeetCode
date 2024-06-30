// LeetCode 112 Path Sum 
// References: https://leetcode.com/problems/path-sum/?envType=study-plan-v2&envId=top-interview-150

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean rootToLeafPathSum(TreeNode root, int targetSum, int sum){
        if (root == null) return false;

        if (root.left == null && root.right == null){
            sum += root.val;
            if (sum == targetSum)
                return true;
        }

        return rootToLeafPathSum(root.left, targetSum, sum + root.val) ||
            rootToLeafPathSum(root.right, targetSum, sum + root.val);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return rootToLeafPathSum(root, targetSum, sum);
    }
}