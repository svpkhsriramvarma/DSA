class Solution {
    public static int solve(int arr[][],int row,int col,int n,int m,int dp[][]) {
        if(row < 0 || col < 0 || col >= m || row >= n || arr[row][col] == 1)
            return 0;
        if(row == n-1 && col == m-1)
            return 1;
        else {
            if(dp[row][col] != -1)
                return dp[row][col];
            int temp = arr[row][col];
            arr[row][col] = 1;
            int count1 = solve(arr,row+1,col,n,m,dp);
            int count2 = solve(arr,row,col+1,n,m,dp);
            arr[row][col] = temp;

            return dp[row][col] = count1+count2;
        }
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int dp[][] = new int[n][m];
        for(int arr[] : dp) {
            Arrays.fill(arr,-1);
        }
        return solve(obstacleGrid,0,0,n,m,dp);
    }
}