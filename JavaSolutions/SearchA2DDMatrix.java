class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int rl = 0, rr = matrix.length - 1, cr = matrix[0].length - 1, cl = 0;
        while(rl <= rr){
            int rm = rl + (rr - rl)/2;
            if(target == matrix[rm][cr]) return true;
            else if(target < matrix[rm][cl])
                rr = rm - 1;
            else if(target > matrix[rm][cr])
                rl = rm + 1;
            else{
                // present in rm row
                if(target == matrix[rm][cl] || target == matrix[rm][cr]) return true;
                while(cl <= cr){
                    int mid = cl + (cr - cl)/2;
                    if(matrix[rm][mid] == target) return true;
                    else if(matrix[rm][mid] < target) 
                        cl = mid + 1;
                    else
                        cr = mid - 1;
                }
                return false;
            }
        }
        return false;
    }
}