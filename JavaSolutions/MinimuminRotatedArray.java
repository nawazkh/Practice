class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;
        while(l < h){
            int mid = l + (h - l)/2;
            System.out.println(l+" "+mid+" "+h);
            if(nums[h] > nums[mid]){// rotation in low to mid
                h = mid;
            }
            else if(nums[mid] > nums[h]){
                l = mid+1;
            }else{
                h--;// for repeated elements.
            }
        }
        return Math.min(nums[l],nums[h]);
    }
}

// for array with unique elements.
class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length - 1;
        while(l < h){
            int mid = l + (h - l)/2;
            System.out.println(l+" "+mid+" "+h);
            if(nums[h] > nums[mid]){// rotation in low to mid
                h = mid;
            }
            else if(nums[mid] > nums[h]){
                l = mid+1;
            }
        }
        return nums[l];
    }
}

