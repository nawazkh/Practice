class Solution {
    public int countPrimes(int n) {
        if(n <= 1) return 0;
        int count = 0;
        if(n > 2) count = 1;
        if(n > 3) count = 2;
        boolean p = true;
        for(int j = 4; j < n; j++){
            p = true;
            for(int i = 2; i <= Math.sqrt(j); i++){
                if(j % i == 0) {
                    p = false;
                    break;
                } 
            }
            if(p){
                System.out.println(j);
                count++;
            } 
        }
        return count;
    }
}