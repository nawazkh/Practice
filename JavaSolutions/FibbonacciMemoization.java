class Solution {
    private Map<Integer,Integer> cache = new HashMap<Integer,Integer>();
    public int fib(int N) {
        if(cache.containsKey(N))
            return cache.get(N);
        int val = 0;
        if(N < 2){
            return N;
        }else{
            val = fib(N-1) + fib(N-2);
        }
        cache.put(N,val);
        return val;
    }
}