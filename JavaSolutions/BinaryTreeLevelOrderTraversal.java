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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        formTree(root, result, 1);
        return result;
    }
    
    public void formTree(TreeNode root, List<List<Integer>> result, int level){
        if(root == null) return;
        if(result.size() < level)
            result.add(new ArrayList<Integer>());
        result.get(level - 1).add(root.val);
        formTree(root.left,result,level+1);
        formTree(root.right,result,level+1);
    }
}