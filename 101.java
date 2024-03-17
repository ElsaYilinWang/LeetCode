// LeetCode 101 Symmetric Tree
// Reference: https://leetcode.com/problems/symmetric-tree/solutions/33054/recursive-and-non-recursive-solutions-in-java/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

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
    public boolean isSymmetric(TreeNode root) {
        // Recursive
        return root == null || isSymmetricHelp(root.left, root.right);

    }
    private boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left==null || right==null)
            return left==right;
        if(left.val!=right.val)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
}

class Solution {
    public boolean isSymmetric2(TreeNode root) {
        // Iteration

        if (root == null) {return true;}

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode left, right;

        if (root.left != null){
            if (root.right == null) {return false;}
            stack.push(root.left);
            stack.push(root.right);
        
        } else if (root.right != null){
            return false;
        }

        while(!stack.empty()){
            if(stack.size() %2 != 0){return false;}

            right = stack.pop();
            left = stack.pop();

            if(right.val != left.val){return false;}

            if(left.left!=null){
                if(right.right==null)   return false;
                stack.push(left.left);
                stack.push(right.right);

            } else if(right.right!=null){
                return false;
            }
                
            if(left.right!=null){
                if(right.left==null)   return false;
                stack.push(left.right);
                stack.push(right.left);
            }
            else if(right.left!=null){
                return false;
            }
        }
        
        return true;
        }
    }
}




public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
     }
}
