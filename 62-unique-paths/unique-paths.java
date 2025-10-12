class Solution {
    public static int solve(int m,int n,int i,int j,int arr[][],int dp[][]) {
        if(i == m-1 && j == n-1) {
            return 1;
        } else if(i >= m || j >= n || i < 0 || j < 0 || arr[i][j] == -1) {
            return 0;
        } else {
            if(dp[i][j] != -1)
                return dp[i][j];
            int temp = arr[i][j];
            arr[i][j] = -1;
            int right = solve(m,n,i,j+1,arr,dp);
            int down = solve(m,n,i+1,j,arr,dp);
            arr[i][j] = temp;
            return dp[i][j] = right+down;
        }
    }
    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m][n];
        int dp[][] = new int[m][n];
        for(int a[] : dp) {
            Arrays.fill(a,-1);
        }
        for(int i = 0;i < m;i++) {
            Arrays.fill(arr[i],1);
        }

        return solve(m,n,0,0,arr,dp);
    }
}