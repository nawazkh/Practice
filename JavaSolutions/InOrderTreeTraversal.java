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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> myList = new ArrayList<Integer>();
        if(root == null) return myList;
        return traverse(root,myList);
    }
    public List<Integer> traverse(TreeNode root, List<Integer> myList){
        if(root == null) return null;
        traverse(root.left, myList);
        myList.add(root.val);
        traverse(root.right,myList);
        return myList;
    }
}