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
    private List<Integer> myList = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> myLL = new LinkedList<>();
        if(root == null) return myList;
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                myLL.addFirst(cur.val);
                cur = cur.right;
            }else{
                cur = stack.pop();
                cur = cur.left;
            }
        }
        return myLL;
        // postOrder(root);
        // return myList;
    }
    public void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        myList.add(root.val);
    }
}