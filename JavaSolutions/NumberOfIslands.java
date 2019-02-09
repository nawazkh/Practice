class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        Deque<int[]> q = new ArrayDeque<int[]>();
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int counter = 0;
        for(int i = 0; i < rowLen; i++){
            for(int j = 0; j < colLen; j++){
                if(grid[i][j] == '1') {
                    q.addLast(new int[]{i,j});
                    grid[i][j] = 'X';
                    counter++;
                }
                while(!q.isEmpty()){
                    int[] top = q.removeFirst();
                    int row = top[0],col = top[1];
                    if(row > 0 && grid[row - 1][col] == '1'){
                        grid[row - 1][col] = 'X';
                        q.addLast(new int[]{row - 1,col});
                    }
                    if(row < rowLen - 1 && grid[row + 1][col] == '1'){
                        grid[row + 1][col] = 'X';
                        q.addLast(new int[]{row + 1,col});
                    }
                    if(col > 0 && grid[row][col - 1] == '1'){
                        grid[row][col - 1] = 'X';
                        q.addLast(new int[]{row,col - 1});
                    }
                    if(col < colLen - 1 && grid[row][col + 1] == '1'){
                        grid[row][col + 1] = 'X';
                        q.addLast(new int[]{row,col + 1});
                    }
                }
            }
        }
        return counter;
    }
}