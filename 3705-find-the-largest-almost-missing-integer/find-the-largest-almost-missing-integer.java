class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[51];
        for (int x : nums) count[x]++;

        if (k == 1) {
            int ans = -1;
            for (int x : nums) {
                if (count[x] == 1) ans = Math.max(ans, x);
            }
            return ans;
        }

        if (k == n) {
            int ans = -1;
            for (int x : nums) ans = Math.max(ans, x);
            return ans;
        }

        int candidate1 = (count[nums[0]] == 1) ? nums[0] : -1;
        int candidate2 = (count[nums[n - 1]] == 1) ? nums[n - 1] : -1;
        return Math.max(candidate1, candidate2);
    }
}
