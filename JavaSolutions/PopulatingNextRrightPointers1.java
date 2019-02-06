/*
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
        List<List<TreeLinkNode>> myList = new ArrayList<>();
        match(root, myList, 1);
        for(int i = 0; i < myList.size(); i++){
            List<TreeLinkNode> temp = myList.get(i);
            for(int j = 1; j < myList.get(i).size();j++){
                temp.get(j - 1).next = temp.get(j);
            }
        }
    }
    public void match(TreeLinkNode root,List<List<TreeLinkNode>> myList,int depth){
        if(root == null) return;
        if(myList.size() < depth)
            myList.add(new ArrayList<TreeLinkNode>());
        myList.get(depth - 1).add(root);
        match(root.left, myList, depth+1);
        match(root.right, myList, depth+1);
    }
}