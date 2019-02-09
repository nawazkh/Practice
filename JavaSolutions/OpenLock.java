class Solution {
    public int openLock(String[] deadends, String target) {
        
        Set<String> deadend = new HashSet<String>();
        
        for(int i = 0; i < deadends.length; i++){
            deadend.add(deadends[i]);
        }
        
        Set<String> seen = new HashSet<String>();
        Deque<String[]> q = new ArrayDeque<String[]>();
        
        q.addLast(new String[]{"0000","0"});
        seen.add("0000");
        
        while(!q.isEmpty()){
            String[] current = q.removeFirst();
            String state = current[0];
            Integer count = Integer.parseInt(current[1]);
            if(!(deadend.contains(state))){//not a deadend, generate next states
                if(state.equals(target)) return count;
                count++;
                for(int i = 0; i < 4; i ++) {
                    char c = state.charAt(i);
                    String s1 = state.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + state.substring(i + 1);
                    String s2 = state.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + state.substring(i + 1);
                    
                    if(!deadend.contains(s1) && !seen.contains(s1)){//not a deadend and not seen earlier, add to queue
                        seen.add(s1);
                        q.addLast(new String[]{s1,Integer.toString(count)});
                    }
                    if(!deadend.contains(s2) && !seen.contains(s2)){
                        seen.add(s2);
                        q.addLast(new String[]{s2,Integer.toString(count)});
                    }
                }
                
            }
        }
        return -1;
    }
}