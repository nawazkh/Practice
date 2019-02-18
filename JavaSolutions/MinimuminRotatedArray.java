class Solution {
    public int findMin(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] < nums[i]) return nums[i+1];
        }
        return nums[nums.length - 1] < nums[0] ? nums[nums.length - 1] : nums[0];
    }
}