class Solution {
    public int numSquares(int n) {
        if( n == 0) return 0;
        if(n == 1) return 1;
        Set<Integer> seen = new HashSet<Integer>();
        Deque<Integer[]> q = new ArrayDeque<Integer[]>();
        Set<Integer> moves = new HashSet<Integer>();
        seen.add(n);
        q.addLast(new Integer[]{n,0});
        while(!q.isEmpty()){
            Integer[] state = q.removeFirst();
            Integer val = state[0];
            Integer count = state[1];
            // System.out.println(val);
            if(val == 0) moves.add(count);
            count++;
            for(int i = 1; (i*i) <= val; i++){
                // System.out.println(i*i);
                int remaining = val - (i*i);
                if(!seen.contains(remaining) && remaining >= 0){
                    seen.add(remaining);
                    q.addLast(new Integer[]{remaining,count});
                }
            } 
        }
        Integer soln = Integer.MAX_VALUE;
        for(Integer move : moves){
            if(move < soln){
                soln = move;
            }
        }
        return (soln == Integer.MAX_VALUE) ? 0 : soln;
    }
}