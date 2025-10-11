class Solution {
    public static boolean solve(char board[][],int row,int col) {
        if(row == 9)
            return true;
        int nextRow = row,nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(board[row][col] != '.')
            return solve(board,nextRow,nextCol);
        for(int digit = 1;digit <= 9;digit++) {
            if(isSafe(board,row,col,digit)) {
                board[row][col] = (char)(digit+'0');
                if(solve(board,nextRow,nextCol))
                    return true;
                board[row][col] = '.';

            }
        }
        return false;
    }
    public static boolean isSafe(char board[][],int row,int col,int digit) {
        char ch = (char)(digit+'0');
        //vertical
        for(int i = 0;i < 9;i++) {
            if(board[i][col] == ch)
                return false;
        }
        //horizontal
        for(int j = 0;j < 9;j++) {
            if(board[row][j] == ch)
                return false;
        }

        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr;i < sr+3;i++) {
            for(int j = sc;j < sc+3;j++) {
                if(board[i][j] == ch)
                    return false;
            }
        }

        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
}
