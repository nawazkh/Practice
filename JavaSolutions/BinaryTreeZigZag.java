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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> myList = new ArrayList<>();
        if(root == null) return myList;
        getZigZag(root, myList, 1);
        return myList;
    }
    public void getZigZag(TreeNode root, List<List<Integer>> myList, int depth){
        if(root == null) return;
        if(myList.size() < depth)
            myList.add(new ArrayList<Integer>());
        if(depth%2 == 0){
            myList.get(depth - 1).add(root.val);
        }else{
            myList.get(depth - 1).add(0,root.val);
        }
        // myList.get(depth - 1).add(root.val);
        
        getZigZag(root.right, myList, depth + 1);
        getZigZag(root.left, myList, depth + 1);
        
    }
}