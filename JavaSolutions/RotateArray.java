class Solution {
    public void rotate(int[][] matrix) {
        if(matrix.length <= 1 || matrix == null)
            return;
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            int head = 0;
            int tail = matrix.length - 1;
            while(head < tail){
                int temp = matrix[i][head];
                matrix[i][head] = matrix[i][tail];
                matrix[i][tail] = temp;
                head++;
                tail--;
            } 
        }
    }
}