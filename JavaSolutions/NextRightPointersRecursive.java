/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        connectNow(root, null);
    }
    public void connectNow( TreeLinkNode root, TreeLinkNode nextNode){
        if(root == null) return;
           root.next = nextNode;
        connectNow(root.left, root.right);
        if(nextNode != null){
            connectNow(root.right,nextNode.left);
        }else{
            connectNow(root.right,null);
        }
    }
        
}