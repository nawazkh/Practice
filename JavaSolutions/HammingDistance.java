class Solution {
    public int hammingDistance(int x, int y) {
        if(x == 0 && y == 0) return 0;
        int count = 0;
        while(true){
            if(x == 0 && y == 0) break;
            if((x & 1) != (y & 1)) count++;
            if(x == 0 && y != 0){
                y = y >>> 1;
            }else if(x != 0 && y == 0){
                x = x >>> 1;
            }else{
                x = x >>> 1;
                y = y >>> 1;
            }            
        }
        return count;
    }
}