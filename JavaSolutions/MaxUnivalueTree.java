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
    private int maxLen = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        helper(root,root.val);
        return maxLen;
    }
    public int helper(TreeNode root,int preVal){
        if(root == null) return 0;
        
        int leftLen = helper(root.left, root.val);
        int rightLen = helper(root.right, root.val);
        
        maxLen = Math.max(leftLen+rightLen, maxLen);
        
        if(root.val == preVal){
            return Math.max(leftLen, rightLen) + 1;
        }
        return 0;
    }
}