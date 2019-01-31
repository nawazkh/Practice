class Solution {
    public int climbStairs(int n) {
        n = n+1;
        int[] p = new int[n];
        if(n == 0) return 1;
        if(n == 1) return 1;
        p[0] = 1;
        p[1] = 1;
        for(int i = 2; i < n; i++){
            p[i] = p[i-2] + p[i-1];
        }
        return p[n-1];
    }
}