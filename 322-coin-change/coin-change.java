class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int dp[][] = new int[n+1][amount+1];

        for(int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for(int j = 1; j <= amount; j++) {
            dp[0][j] = 10000000;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= amount; j++) {
                int val = coins[i-1];
                if(val <= j)
                    dp[i][j] = Math.min(1 + dp[i][j - val], dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n][amount] >= 10000000 ? -1 : dp[n][amount];
    }
}
