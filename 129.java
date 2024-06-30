// Leetcode 129 Sum Root to Leaf Numbers 
// References:https://leetcode.com/problems/sum-root-to-leaf-numbers/solutions/41531/clean-java-dfs-solution-preorder-traversal/?envType=study-plan-v2&envId=top-interview-150
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
    int total;

    public int sumNumbers(TreeNode root) {
        total = 0;
        helper(root, 0);
        return total;
    }

    void helper(TreeNode root, int sum){
        if (root == null) return;

        sum = sum * 10 + root.val;

        if (root.left == null && root.right == null){
            total += sum;
            return;
        }
        helper(root.left, sum);
        helper(root.right, sum);
    }
}