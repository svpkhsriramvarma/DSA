class Solution {
    public static boolean isFound(int nums[],int original) {
        for(int val : nums) {
            if(val == original)
                return true;
        }
        return false;
    }
    public int findFinalValue(int[] nums, int original) {
        while(isFound(nums,original)) {
            original *= 2;
        }
        return original;
    }
}