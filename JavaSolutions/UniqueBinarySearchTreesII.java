class Solution {
    private List<TreeNode> myList;
    public List<TreeNode> generateTrees(int n) {
        if(n == 0) return new ArrayList<>();
        return helper(1,n);
        
    }
    public List<TreeNode> helper(int start, int end){
        List<TreeNode> all_trees = new ArrayList<TreeNode>();
        if(start > end){
           all_trees.add(null);
           return all_trees;
        }
        for(int i = start; i <= end; i++){
            List<TreeNode> left_trees = helper(start, i-1);
            List<TreeNode> right_trees = helper(i+1, end);
            
            for(TreeNode l : left_trees){
                for(TreeNode r: right_trees){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    all_trees.add(root);
                }
            }
        }
        return all_trees;
    }
}