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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length <= 0) return null;
        return helper(inorder, postorder, 0, inorder.length-1, postorder.length-1);
    }
    
    public TreeNode helper(int[] inorder, int[] postorder, int inStart, int inEnd, int postPoint){
        if(inEnd - inStart < 0) return null;
        if(postPoint < 0) return null;
        boolean isPresent = false;
        int p = inStart;
        int q = postPoint;
        // System.out.println("stats"+inStart+" "+inEnd+" "+postPoint);
        for(int j = postPoint; j >= 0; j--){
            for(int i = inStart; i <= inEnd; i++){
                if(inorder[i] == postorder[j]){
                    // System.out.println("stats 2:"+i+" "+j);
                    isPresent = true;
                    p = i;
                    break;
                }
            }
            if(isPresent){
                q = j;
                break;
            }
        }
        
        int temp = postorder[q];
        TreeNode root = new TreeNode(temp);
        //find index of root in inorder
        
        // for(int i = inStart; i <= inEnd; i++){
        //     if(inorder[i] == temp)
        //         break;
        // }
        // System.out.println("root"+postorder[q]+" "+q);
        // System.out.println("inorder"+inorder[p]+" "+p);
        
        root.left = helper(inorder, postorder, inStart, p-1, q - 1);
        root.right = helper(inorder, postorder, p+1, inEnd, q - 1);
        return root;
    }
}