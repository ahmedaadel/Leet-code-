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
    public boolean isSymmetric(TreeNode root) 
    {
        if(root ==null)
            return true ;
       
        return isSymmetric(root.left,root.right) ;
    }
    
    public boolean isSymmetric(TreeNode lftroot,TreeNode righttroot) 
    {
        if(lftroot == null && righttroot == null)
            return true ;
        else if(lftroot == null || righttroot == null)
            return false  ;
        
        if ( lftroot.val  !=  righttroot.val)
            return false ;
        if( ! isSymmetric(lftroot.left, righttroot.right))
            return false ;
        if( ! isSymmetric(lftroot.right, righttroot.left))
            return false ;
            
        return true;
    }
}