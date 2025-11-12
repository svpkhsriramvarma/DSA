class Solution {
    public static int solve(int arr[]) {
        if(arr.length == 0)
            return 0;
        int min = arr[0];
        int profit = 0;

        for(int i = 1;i < arr.length;i++) {
            int cost = arr[i]-min;
            profit = Math.max(profit,cost);
            min = Math.min(min,arr[i]);
        }
        return profit;

    }
    public int maxProfit(int[] prices) {
        return solve(prices);
    }
}