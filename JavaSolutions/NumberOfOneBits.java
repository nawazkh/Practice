public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if(n == 0) return 0;
        int count = 0;
        while(n != 0){
            int temp = n & 1;
            if(temp == 1) count++;
            n = n>>>1;
        }
        return count;
    }
    
}