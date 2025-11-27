class Solution {
    public static int solve(int coins[],int idx,int target,int dp[][]) {
        if(idx == 0) {
            return target % coins[0] == 0 ? 1 : 0;
        }
        if(dp[idx][target] != -1)
            return dp[idx][target];

        int noTake = solve(coins,idx-1,target,dp);
        int take = 0;
        if(coins[idx] <= target) 
            take = solve(coins,idx,target-coins[idx],dp);
        return dp[idx][target] = take+noTake;
    }
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length+1][amount+1];
        for(int a[] : dp) {
            Arrays.fill(a,-1);
        }
        return solve(coins,coins.length-1,amount,dp);
    }
}