class Solution {
    // private int ways = 0;
    public int findTargetSumWays(int[] nums, int S) {
        return helper(nums, S, 0, 0);
    }
    public int helper(int[] nums, int target, int position, int sum){
        if(position == nums.length){
            if(sum == target)
                return 1;
            else
                return 0;
        }
        return (helper(nums,target,position+1,sum+nums[position]) + helper(nums,target,position+1,sum-nums[position]));
    }
}