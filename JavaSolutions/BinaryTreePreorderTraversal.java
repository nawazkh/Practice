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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return myList;
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        myStack.push(root);
        while(!myStack.empty()){
            TreeNode temp = myStack.pop();
            if(temp != null){
                System.out.println(temp.val);
                myList.add(temp.val);
                if(temp.right!=null)
                    myStack.push(temp.right);
                if(temp.left!=null)
                    myStack.push(temp.left);
            }
            
        }
        
        // preOrder(root);
        return myList;
    }
    
    public TreeNode preOrder(TreeNode root){
        if(root == null) return null;
        myList.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
        return root;
    }
}