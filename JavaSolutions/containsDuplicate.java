class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set mySet = new HashSet();
        // mySet.add(nums[0]);
        for(int i = 0; i < nums.length; i++){
            if(mySet.contains(nums[i])){
                return true;
            }
            mySet.add(nums[i]);
        }
        return false;
    }
}