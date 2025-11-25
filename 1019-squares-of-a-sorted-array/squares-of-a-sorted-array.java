class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0,right = nums.length-1;
        int idx = nums.length-1;
        int res[] = new int[nums.length];

        while(left <= right) {
            int l = (int) Math.pow(nums[left],2);
            int r = (int) Math.pow(nums[right],2);

            if(l > r) {
                res[idx] = l;
                left++;
            } else {
                res[idx] = r;
                right--;
            }
            idx--;
        }
        return res;
    }
}