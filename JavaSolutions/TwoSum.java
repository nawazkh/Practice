class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] retArray = new int[2];
        if(target >= 0){
            for(int i = 0; i < nums.length; i++){
                int rem = target - nums[i];
                    for(int j = i + 1; j < nums.length; j++){
                        if(nums[j] == rem){
                            retArray[0] = i;
                            retArray[1] = j;
                        }
                    }
                
            } 
        }
        else{
            for(int i = 0; i < nums.length; i++){
                int rem = target - nums[i];
                    for(int j = i + 1; j < nums.length; j++){
                        if(nums[j] == rem){
                            retArray[0] = i;
                            retArray[1] = j;
                        }
                    }
                
            } 
        }
        
        return retArray;
    }
}