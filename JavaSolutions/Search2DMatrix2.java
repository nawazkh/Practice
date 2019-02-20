// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         if(matrix.length == 0 || matrix[0].length == 0) return false;
//         int rr = matrix.length - 1, cr = matrix[0].length - 1, rl = 0, cl = 0;
//         while(rr >= rl && cr >= cl){
//             System.out.println(matrix[rr][cr]);
//             if(target == matrix[rr][cr]) return true;
//             else if(target > matrix[rr][cr]) return false;
//             else{
//                 if(target == matrix[rr][cl] || target == matrix[rl][cr] || target == matrix[rl][cl]) return true;
                
//                 if(target < matrix[rr][cl]) 
//                     rr = rr - 1;
//                 else //if(target > matrix[rr][cl])
//                     cl = cl + 1;
//                 if(target < matrix[rl][cr]) 
//                     cr = cr - 1;
//                 else //if(target > matrix[rl][cr])
//                     rl = rl + 1;
//             }
//         }
//         return false;
//     }
// }

class Solution{
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int row = 0, col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(target == matrix[row][col]) return true;
            if(target < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}