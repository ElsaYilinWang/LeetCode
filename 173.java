// Leetcode 173 Binary Search Tree Iterator
// References:https://leetcode.com/problems/binary-search-tree-iterator/solutions/52526/ideal-solution-using-stack-java/?envType=study-plan-v2&envId=top-interview-150


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
class BSTIterator {

    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null){
            stack.push(cur);
            if (cur.left != null)
                cur = cur.left;
            else
                break;
        }
        
    }
    /** return the next smallest number */
    public int next() {

        TreeNode node = stack.pop();
        TreeNode cur = node;
        // traversal right branch
        if (cur.right != null){
            cur = cur.right;

            while(cur != null){
                stack.push(cur);
                if (cur.left != null)
                    cur = cur.left;
                else 
                    break;
            }
        }

     return node.val;  
    }
    /**return whether we have a next smallest number */
    public boolean hasNext() {

        return !stack.isEmpty();
        
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */