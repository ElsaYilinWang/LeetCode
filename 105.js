// LeetCode 105 Construct Binary Tree from Preorder and Inorder Traversal
// Reference: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[]} preorder
 * @param {number[]} inorder
 * @return {TreeNode}
 */
var buildTree = function(preorder, inorder) {
    let M = new Map();

    for (let i = 0; i < inorder.length; i++){
        M.set(inorder[i], i);
    }
    return splitTree(preorder, M, 0, 0, inorder.length-1);
    
};

var splitTree = function(preorder, M, pix, ileft, iright){
    let rval = preorder[pix],
        root = new TreeNode(rval),
        imid = M.get(rval);
    
        if (imid > ileft){
            root.left = splitTree(preorder, M, pix+1, ileft, imid-1)
        }
        if (imid < iright){
            root.right = splitTree(preorder, M, pix+imid-ileft+1, imid+1, iright)
        }
        return root;

}