// LeetCode 105 Construct Binary Tree from Preorder and Inorder Traversal
// Reference: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/solutions/1258712/js-python-java-c-easy-recursive-solution-w-explanation/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> M = new HashMap<>();

        for(int i=0; i < inorder.length; i++){
            M.put(inorder[i], i);

        }
        return splitTree(preorder, M, 0, 0, inorder.length-1);
        
    }

    private TreeNode splitTree(int[] preorder, Map<Integer, Integer> M, int pix, int ileft, int iright){
        int rval = preorder[pix], imid = M.get(rval);
        TreeNode root = new TreeNode(rval);
        if (imid > ileft){
            root.left = splitTree(preorder, M, pix+1, ileft, imid-1);
        }

        if (imid < iright){
            root.right = splitTree(preorder, M, pix+imid-ileft+1, imid+1, iright);
        }
        return root;
    }
}



