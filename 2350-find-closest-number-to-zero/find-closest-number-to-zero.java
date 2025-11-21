class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        for(int val : nums) {
            if(Math.abs(val) < Math.abs(closest))
                closest = val;
            else if(Math.abs(val) == Math.abs(closest) && val > closest)
                closest = val;
        }
        return closest;
    }
}