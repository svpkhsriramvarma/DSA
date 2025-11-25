class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);
        int longest = 1,lastSmall = Integer.MIN_VALUE,count = 0;

        for(int i = 0;i < nums.length;i++) {
            if(nums[i]-1 == lastSmall) {
                count++;
                lastSmall = nums[i];
            } else if(nums[i] != lastSmall) {
                lastSmall = nums[i];
                count = 1;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}