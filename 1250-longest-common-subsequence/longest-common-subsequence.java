class Solution {
    public static int solve(String s1,String s2,int n,int m,int dp[][]) {
        if(n < 0 || m < 0)
            return 0;
        if(dp[n][m] != -1)
            return dp[n][m];
        if(s1.charAt(n) == s2.charAt(m))
            return dp[n][m] = solve(s1,s2,n-1,m-1,dp)+1;
        else {
            return dp[n][m] = Math.max(solve(s1,s2,n-1,m,dp),solve(s1,s2,n,m-1,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()][text2.length()];
        for(int a[] : dp)
            Arrays.fill(a,-1);
        return solve(text1,text2,text1.length()-1,text2.length()-1,dp);
    }
}