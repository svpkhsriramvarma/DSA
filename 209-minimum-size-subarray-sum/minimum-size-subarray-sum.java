class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0, min = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];

            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return min== Integer.MAX_VALUE ? 0 : min;
    }
}