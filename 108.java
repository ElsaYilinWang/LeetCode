//LeetCode 108 Convert Sorted Array to Binary Search Tree
//Reference: https://www.youtube.com/watch?v=guyEygPRaiE

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
    int[] Nums;
    public TreeNode sortedArrayToBST(int[] nums) {
        Nums = nums;
        return buildBST(0, nums.length - 1);

    }
    private TreeNode buildBST(int s, int e){
        if (s > e){ return null;}

        int mid = (s + e) /2 ;

        TreeNode cur = new TreeNode(Nums[mid]);

        //build left and right
        cur.left = buildBST(0, mid-1);
        cur.right = buildBST(mid+1, e);

        return cur;
    }
}




