class Solution {
    public static boolean isSafe(char board[][],int row,int col,char digit) {
        //veritcal
        for(int i = 0;i < 9;i++) {
            if(board[i][col] == digit)
                return false;
        }
        //horisontal
        for(int i = 0;i < 9;i++) {
            if(board[row][i] == digit)
                return false;
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr;i < sr+3;i++) {
            for(int j = sc;j < sc+3;j++) {
                if(board[i][j] == digit)
                    return false;
            }
        }

        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i= 0;i < 9;i++) {
            for(int j = 0;j < 9;j++) {
                char ch = board[i][j];
                if(ch != '.') {
                    board[i][j] = '.';
                    if(!isSafe(board,i,j,ch)) 
                        return false;
                    board[i][j] = ch;
                }
            }
        }
        return true;
    }
}