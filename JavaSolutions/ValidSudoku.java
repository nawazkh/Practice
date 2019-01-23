class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] boxes = new int[3][3];
        int[] rows = new int[9];
        int[] cols = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int num = board[i][j] - '0';
                if (num <= 0 || num > 9) {
                    return false;
                }
                rows[i] = addMask(num, rows[i]);
                cols[j] = addMask(num, cols[j]);
                boxes[i / 3][j / 3] = addMask(num, boxes[i / 3][j / 3]);
                if (rows[i] < 0 || cols[j] < 0 || boxes[i / 3][j / 3] < 0) {
                    return false;
                }
            }
        }
        return true;
    }
    private int addMask(int i, int mask) {
        int tmp = (1 << (i - 1));
        if ((tmp & mask) != 0) return -1;
        return mask | tmp;
    }
}