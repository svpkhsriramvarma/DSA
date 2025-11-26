class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int left = 0,right = 0,kcount = 0;
        while(right < nums.length) {
            if(nums[right] == 0)
                kcount++;
            while(kcount > k) {
                if(nums[left] == 0)
                    kcount--;
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}