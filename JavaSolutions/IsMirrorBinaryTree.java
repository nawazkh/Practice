/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return checkIsSymmetric(root,root);
    }
    public boolean checkIsSymmetric(TreeNode lSubTree, TreeNode rSubTree){
        if(lSubTree == null && rSubTree == null) return true;
        if(lSubTree == null || rSubTree == null) return false;
        if(lSubTree.val != rSubTree.val) return false;
        
        return (checkIsSymmetric(lSubTree.left, rSubTree.right) && checkIsSymmetric(lSubTree.right, rSubTree.left));
    }
}