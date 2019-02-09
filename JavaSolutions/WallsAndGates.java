class Solution {
    public void wallsAndGates(int[][] rooms) {
        if(rooms.length == 0) return;
        Deque<int[]> q = new ArrayDeque<int[]>();
        int rowLen = rooms.length;
        int colLen = rooms[0].length;
        for(int i = 0; i < rowLen; i++){
            for(int j = 0; j < colLen; j++){
                if(rooms[i][j] == 0) q.addLast(new int[]{i, j});
            }
        }
        while(!q.isEmpty()){
            int[] gate = q.removeLast();
            int row = gate[0], col = gate[1];
            if(col < colLen - 1 && rooms[row][col+1] == Integer.MAX_VALUE){
                rooms[row][col+1] = rooms[row][col]+1;
                q.addFirst(new int[]{row, col+1});
            }
            if(col > 0 && rooms[row][col-1] == Integer.MAX_VALUE){
                rooms[row][col-1] = rooms[row][col]+1;
                q.addFirst(new int[]{row, col-1});
            }
            if(row > 0 && rooms[row-1][col] == Integer.MAX_VALUE){
                rooms[row-1][col] = rooms[row][col]+1;
                q.addFirst(new int[]{row-1, col});
            }
            if(row < rowLen - 1 && rooms[row+1][col] == Integer.MAX_VALUE){
                rooms[row+1][col] = rooms[row][col]+1;
                q.addFirst(new int[]{row+1, col});
            }
            
        }
    }
}