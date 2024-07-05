// Leetcode 230 Kth Smallest Element in a BST
// References:https://leetcode.com/problems/kth-smallest-element-in-a-bst/solutions/63783/two-easiest-in-order-traverse-java/?envType=study-plan-v2&envId=top-interview-150

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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        int count = 0;

        while (p != null || !stack.isEmpty()){
            if (p != null) {
                stack.push(p); // similar to calling dfs(root.left)
                p = p.left;
            } else {
                p = stack.pop();

                //---------- real code starts here ----------
                count++;
                if (count == k){
                    return p.val;
                }
                //-------------------------------------------
                p = p.right;  // similar to calling dfs(root.right)
            }
        }
        return Integer.MIN_VALUE;
    }
}


