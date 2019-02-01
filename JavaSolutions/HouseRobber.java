class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int[] profit = new int[nums.length];
        profit[0] = nums[0];
        profit[1] = Math.max(nums[1],nums[0]);
        for(int i = 2; i < nums.length; i++){
            profit[i] = Math.max((nums[i] + profit[i-2]), profit[i-1]);
        }
        return profit[nums.length-1];
    }
}