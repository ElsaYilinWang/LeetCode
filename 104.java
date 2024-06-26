// LeetCode 104 Maximum Depth of Binary Tree
// Reference: https://leetcode.com/problems/maximum-depth-of-binary-tree/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

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
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int count = 0;
        while(! queue.isEmpty()){
            int size = queue.size();

            while(size -- > 0){
                TreeNode node = queue.poll();

                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            count++;
        }
        return count;


    }
}











