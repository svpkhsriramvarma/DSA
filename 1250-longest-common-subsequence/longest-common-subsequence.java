class Solution {
    public static int solve(String s1,String s2,int n1,int n2,int dp[][]) {
        if(n1 == 0 || n2 == 0)
            return 0;
        if(dp[n1][n2] != -1)
            return dp[n1][n2];
        if(s1.charAt(n1-1) == s2.charAt(n2-1))
            return dp[n1][n2] = 1+solve(s1,s2,n1-1,n2-1,dp);
        
        return dp[n1][n2] = Math.max(solve(s1,s2,n1-1,n2,dp),solve(s1,s2,n1,n2-1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i = 1;i <= n;i++) {
            for(int j = 1;j <= m;j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}