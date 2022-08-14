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
    int lctr=1 ;
    int rctr=1 ;
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
         
        int lctr =1+maxDepth(root.left);
        int rctr =1+maxDepth(root.right);
        
        
        return lctr>rctr?lctr:rctr;
    }
}