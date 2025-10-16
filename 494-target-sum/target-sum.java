class Solution {
    public static int solve(int nums[],int target,int sum,int i) {
        if(i == nums.length) {
            return sum == target ? 1 : 0;
        }

        return solve(nums,target,sum-nums[i],i+1) + solve(nums,target,sum+nums[i],i+1);
    }
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0);
    }
}