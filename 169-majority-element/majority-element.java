class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = 0;
        for(int val : nums) {
            if(count == 0)
                num = val;
            if(num == val)
                count++;
            else
                count--;
        }
        return num;
    }
}