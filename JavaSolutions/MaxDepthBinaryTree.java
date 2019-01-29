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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(isLeaf(root)) return 1;
        return calculateMaxDepth(root);
    }
    public int calculateMaxDepth(TreeNode root){
        if(root == null) return 0;
        if(isLeaf(root)) return 1;
        int counter = 1;
        counter = counter + Math.max(calculateMaxDepth(treeNodeLeft(root)), calculateMaxDepth(treeNodeRight(root)));
        return counter;
    }
    public TreeNode treeNodeLeft(TreeNode root){
        if(root.left == null) return null;
        return root.left;
    }
    public TreeNode treeNodeRight(TreeNode root){
        if(root.right == null) return null;
        return root.right;
    }
    public boolean isLeaf(TreeNode root){
        if(root == null) return true;
        if(treeNodeRight(root) == null && treeNodeLeft(root) == null){
            return true;
        }
        return false;
    }
}