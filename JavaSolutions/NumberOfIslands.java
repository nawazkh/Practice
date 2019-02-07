class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int counter = 0;
        for(int i = 0; i < rowLen; i++){//scan each rows
            for(int j = 0; j < colLen; j++){
                if(grid[i][j] == '1'){
                    //perform a depth and breadth search
                    grid[i][j] = 'x';
                    counter++;
                    breadthRightSearch(grid,'x',i, j+1,colLen);
                    breadthLeftSearch(grid,'x',i, j-1,0);
                    // 
                    depthDownSearch(grid, 'x', j, i+1, rowLen);
                    depthUpSearch(grid, 'x', j, i-1, 0);
                    // printGrid(grid);
                    
                }
//                 else{
//                     System.out.println("found x");
//                     breadthSearch(grid,'x',i, j,colLen);
//                     depthSearch(grid, 'x', j, i, rowLen);
                    
//                     printGrid(grid);
//                 }
            }
        }
        return counter;
    }
    public void breadthRightSearch(char[][] grid, char mark, int rowVal, int left, int right){
        if(left == right  || grid[rowVal][left] == '0' || grid[rowVal][left] == 'x' ) return;
        grid[rowVal][left] = 'x';
        breadthRightSearch(grid,'x',rowVal,left+1,right);
        depthUpSearch(grid,'x',left,rowVal-1,0);
        depthDownSearch(grid,'x',left,rowVal+1,grid.length);
    }
    public void breadthLeftSearch(char[][] grid, char mark,int rowVal, int left, int right){
        if(left < right || grid[rowVal][left] == '0' || grid[rowVal][left] == 'x' ) return;
        grid[rowVal][left] = 'x';
        breadthLeftSearch(grid,'x',rowVal,left-1,right);
        depthUpSearch(grid,'x',left,rowVal-1,0);
        depthDownSearch(grid,'x',left,rowVal+1,grid.length);
    }
    
    public void depthDownSearch(char[][] grid, char mark, int colVal, int top, int bottom){
        // System.out.println(top+" "+bottom);
        if(top == bottom || grid[top][colVal] == '0' || grid[top][colVal] == 'x') return;
        grid[top][colVal] = 'x';
        depthDownSearch(grid, 'x', colVal, top+1, bottom);
        breadthRightSearch(grid, 'x', top, colVal + 1, grid[top].length);
        breadthLeftSearch(grid, 'x', top, colVal - 1 , 0);
    }
    
    public void depthUpSearch(char[][] grid, char mark, int colVal, int top, int bottom){
        if( top < bottom || grid[top][colVal] == '0' || grid[top][colVal] == 'x') return;
        grid[top][colVal] = 'x';
        depthUpSearch(grid, 'x', colVal, top-1, bottom);
        breadthRightSearch(grid, 'x', top, colVal + 1, grid[top].length);
        breadthLeftSearch(grid, 'x', top, colVal - 1 , 0);
    }
    
    public void printGrid(char[][] grid){
        for(int i = 0; i < grid.length; i++){
            System.out.print("Row "+i+": ");
            for(int j = 0; j < grid[0].length; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}