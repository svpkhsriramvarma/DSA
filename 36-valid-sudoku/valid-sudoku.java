class Solution {
    public static boolean isSafe(char board[][],char ch,int row,int col) {
        //horizontal
        for(int i = 0;i < board.length;i++) {
            if(board[row][i] == ch)
                return false;
        }
        //vertical
        for(int i = 0;i < board.length;i++) {
            if(board[i][col] == ch)
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
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                char ch = board[i][j];
                if(ch != '.') {
                    board[i][j] = '.';
                    if(!isSafe(board,ch,i,j))
                        return false;
                    board[i][j] = ch;
                }
            }
        }
        return true;
    }
}