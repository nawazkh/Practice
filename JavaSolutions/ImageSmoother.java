class Solution {
    public int[][] imageSmoother(int[][] M) {
        if(M.length == 0 || M[0].length == 0) return M;
        int n = M.length, m = M[0].length;
        int[][] K = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int newVal = checkNeighbour(M, i, j, n, m);
                // System.out.println(i+" "+j+" "+newVal);
                if(newVal >= 1)
                    K[i][j] = newVal;
                // else{
                //     M[i][j] = 1;
                // }
            }
        }
        return K;
    }
    public int checkNeighbour(int[][] board, int row, int col, int rowLen, int colLen){
        int count = 0;
        int divisor = 0;
        for(int i = Math.max(0,row - 1); i <= Math.min(rowLen - 1, row+1); i++){
            for(int j = Math.max(0,col - 1); j <= Math.min(colLen - 1, col+1); j++){
                count += board[i][j];
                divisor++;
            }
        }
        // System.out.println(count+" "+divisor);
        return (count / divisor);
    }
}