class Solution {
    public static boolean solve(int i, int j, int n, int m, char[][] board, int ind, String word) {
        if (ind == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= n || j >= m || board[i][j] != word.charAt(ind) || board[i][j] == '*') {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '*'; // Mark as visited
        
        boolean found = solve(i - 1, j, n, m, board, ind + 1, word) ||  // Up
                        solve(i + 1, j, n, m, board, ind + 1, word) ||  // Down
                        solve(i, j - 1, n, m, board, ind + 1, word) ||  // Left
                        solve(i, j + 1, n, m, board, ind + 1, word);    // Right
        
        board[i][j] = temp; // Backtrack
        return found;
    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (solve(i, j, n, m, board, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }
}
