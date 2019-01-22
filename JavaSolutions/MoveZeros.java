class Solution {
    public void moveZeroes(int[] nums) {
        int last_index = nums.length - 1;
        int global_counter = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                global_counter++;
        }
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                int zero_counter = 1;
                for (int k = i+1; k < nums.length; k++){
                    if(nums[k] == 0)
                        zero_counter++;
                    else
                        break;
                }
                // global_counter = global_counter + zero_counter;
                // System.out.println(zero_counter);
                for(int j = i; j < nums.length - zero_counter; j++){
                    nums[j] = nums[j + zero_counter];
                }
                nums[last_index] = 0;
            }
        }
        for(int l = nums.length - 1; l >= nums.length - global_counter; l--){
            nums[l] = 0;     
        }
        
    }
}