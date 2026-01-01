class Solution {
    public void moveZeroes(int[] nums) {
        int arr[] = new int[nums.length];
        int i = 0;
        for(int val : nums) {
            if(val != 0) {
                arr[i++] = val;
            }
        }
        for(int j = 0;j < nums.length;j++) {
            nums[j] = arr[j];
        }
    }
}