class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            xor ^= nums[i];   
            xor ^= (i + 1);   
        }

        return xor;
    }
}