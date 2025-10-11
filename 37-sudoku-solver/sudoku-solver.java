class Solution {
    public static boolean solve(char board[][], int row, int col) {
        if (row == 9)
            return true;

        int nextRow = row, nextCol = col + 1;
        if (col == 8) {
            nextRow += 1;
            nextCol = 0;
        }

        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol);
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = (char) (i + '0');
                if (solve(board, nextRow, nextCol))
                    return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col, int digit) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char) (digit + '0'))
                return false;
        }

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == (char) (digit + '0'))
                return false;
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (digit + '0'))
                    return false;
            }
        }

        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}
