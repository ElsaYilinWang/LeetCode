// Leetcode 530 Minimum Absolute Difference in BST
// References:https://leetcode.com/problems/minimum-absolute-difference-in-bst/solutions/3635160/beats-100-easy-video-java-c-python/?envType=study-plan-v2&envId=top-interview-150

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

    int prev = Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }

    public void inOrder(TreeNode root){
        if (root.left != null) inOrder(root.left);
        ans = Math.min(ans, Math.abs(root.val-prev));
        prev = root.val;
        if(root.right != null) inOrder(root.right);
    }
}