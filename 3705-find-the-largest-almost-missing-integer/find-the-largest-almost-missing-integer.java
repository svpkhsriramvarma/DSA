class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];
        int n = nums.length;

        for (int num : nums)
            freq[num]++;

        if (k == 1) {
            for (int i = 50; i >= 0; i--) {
                if (freq[i] == 1)
                    return i;
            }
        } else if (k == n) {
            for (int i = 50; i >= 0; i--) {
                if (freq[i] > 0)
                    return i;
            }
        } else {
            int candidate1 = (freq[nums[0]] == 1) ? nums[0] : -1;
            int candidate2 = (freq[nums[n - 1]] == 1) ? nums[n - 1] : -1;
            return Math.max(candidate1, candidate2);
        }

        return -1;
    }
}
