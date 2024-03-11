// LeetCode 94 Binary Tree Inorder Traversal
//Reference: https://leetcode.com/problems/binary-tree-inorder-traversal/solutions/3169549/solution/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions
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

    private List<Integer> res = new ArrayList<>();


    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }

    
    private void traverse(TreeNode root){
        if (root == null){ return ;}

        traverse(root.left);
        res.add(root.val);
        traverse(root.right);
    }
}