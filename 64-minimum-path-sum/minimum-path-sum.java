class Solution {
    static int minSum = Integer.MAX_VALUE;

    public static void solve(int grid[][], int row, int col, int n, int m, int currSum, int arr[][]) {
        if (row < 0 || col < 0 || row >= n || col >= m)
            return;

        currSum += grid[row][col];

        if (row == n - 1 && col == m - 1) {
            minSum = Math.min(currSum, minSum);
            return;
        }

        if (arr[row][col] != -1 && currSum >= arr[row][col])
            return;

        arr[row][col] = currSum;

        solve(grid, row + 1, col, n, m, currSum, arr);
        solve(grid, row, col + 1, n, m, currSum, arr);
    }

    public int minPathSum(int[][] grid) {
        minSum = Integer.MAX_VALUE;
        int arr[][] = new int[grid.length][grid[0].length];
        for (int a[] : arr) {
            Arrays.fill(a, -1);
        }
        solve(grid, 0, 0, grid.length, grid[0].length, 0, arr);
        return minSum;
    }
}
