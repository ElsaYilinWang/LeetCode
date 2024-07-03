// Leetcode 530 Minimum Absolute Difference in BST
// References:https://leetcode.com/problems/minimum-absolute-difference-in-bst/solutions/423994/easy-to-understand-commented-simple-recursive-javascript-solution/?envType=study-plan-v2&envId=top-interview-150
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var getMinimumDifference = function(root) {

    // Converting tree to an sorted array
    const arr = toArray(root);
    let out = Infinity;
    let i = 1;

    // Finding the difference
    while (i < arr.length){
        let diff = Math.abs(arr[i - 1] - arr[i]);
        if(diff < out) out = diff;
        i++;
    }
    return out;
};

function toArray(root, out=[]){

    if (root){
        toArray(root.left, out);

        out.push(root.val);

        toArray(root.right, out);
        
        return out;
    }
}











