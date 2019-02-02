class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        if(n == 1) return true;
        if(n < 3) return false;
        int rem = 0;
        while(n>1){
            rem = n%3;
            if(rem != 0) {
                System.out.println(n+" "+rem);
                return false;
            }
            n = (n/3);
        }
        return true;
    }
}