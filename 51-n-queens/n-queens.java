class Solution {
    public static void solve(List<List<String>> res, List<String> ans, int n, int row) {
        if (row == n) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(ans, row, i)) {
                char[] arr = ans.get(row).toCharArray();
                arr[i] = 'Q';
                ans.set(row, new String(arr));
                solve(res, ans, n, row + 1);
                arr[i] = '.';
                ans.set(row, new String(arr));
            }
        }
    }

    public static boolean isSafe(List<String> ans, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (ans.get(i).charAt(col) == 'Q')
                return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (ans.get(i).charAt(j) == 'Q')
                return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < ans.size(); i--, j++) {
            if (ans.get(i).charAt(j) == 'Q')
                return false;
        }
        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] arr = new char[n];
            Arrays.fill(arr, '.');
            ans.add(new String(arr));
        }
        solve(res, ans, n, 0);
        return res;
    }
}
