class Solution {
    public int removeDuplicates(int[] nums) {
        int numPointer = 0;
        // int counter = 0;
        for(int i = 1; i < nums.length; i++){
            // System.out.println(nums[i]);
            if(nums[numPointer] != nums[i]){
                // System.out.println("hello"+nums[i]);
                numPointer++;
                nums[numPointer] = nums[i];
                
                // counter++;
            }
        }
        // System.out.println(numPointer);
        return (numPointer + 1);
    }
}