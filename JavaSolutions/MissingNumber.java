class Solution {
    public int missingNumber(int[] nums) {
        if(nums == null) return -1;
        int n = nums.length+1, sum = (n*(n-1)/2), checkSum = 0;
        for(int i = 0; i < nums.length; i++){
            checkSum = checkSum + nums[i];
        }
        if(checkSum == sum) 
            return 0;
        else 
            return (sum - checkSum);
    }
}