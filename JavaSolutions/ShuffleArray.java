class Solution {

    private int[]res;
    private int[]nums;
    public Solution(int[] nums) {
        this.nums=nums;
        res=new int[nums.length];
        reset();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        return res;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int len=res.length;
        while(len>0){
        //Any element at random index generated between 0 and len-1 is swapped with element at len-1 and then len value is decreased so as to restrict value selection between the remaining elements.
            int index=new Random().nextInt(len);
            int x=res[index];
            res[index]=res[len-1];
            res[len-1]=x;
            len--;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */