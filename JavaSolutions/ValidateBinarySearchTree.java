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
    public boolean isValidBST(TreeNode root) {
        return checkValidBST(root, null, null);
    }
    public boolean checkValidBST(TreeNode root, Integer min, Integer max){
        if(root == null) return true;
        
        if(min != null && root.val <= min) return false;
        if(max != null && root.val >= max) return false;
        
        return (checkValidBST(root.left, min, root.val) && checkValidBST(root.right, root.val, max));
    }
}