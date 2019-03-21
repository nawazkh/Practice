class Solution {
    public void gameOfLife(int[][] board) {
        if(board.length == 0 || board[0].length == 0) return;
        int n = board.length, m = board[0].length;
        
        /* for each element, check if it satisfies a rule and respond with a code.
         * depending on the code, update the cel too other value.
         * in the final round of checking, update the other values to 1 */
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int lives = getLives(board, i, j, n, m);
                
                if(board[i][j] == 1 && lives >= 2 && lives <= 3)
                    board[i][j] = 3;
                if(board[i][j] == 0 && lives == 3)
                    board[i][j] = 2;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                board[i][j] >>= 1;
            }
        }
    }
    
    public int getLives(int[][] board, int row, int col, int rowLen, int colLen){
        int lives = 0;
        for(int x = Math.max(row - 1, 0); x <= Math.min(rowLen - 1, row+1); x++){
            for(int y = Math.max(col - 1, 0); y <= Math.min(colLen - 1, col+1); y++){
                lives += board[x][y] & 1;
            }
        }
        lives -= board[row][col] & 1;
        return lives;
    }
    
}