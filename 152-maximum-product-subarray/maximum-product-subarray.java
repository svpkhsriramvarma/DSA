class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE,prefix = 1,sufix = 1,n = nums.length;
        for(int i = 0;i < n;i++) {
            if(prefix == 0)
                prefix = 1;
            if(sufix == 0)
                sufix = 1;
            prefix *= nums[i];
            sufix *= nums[n-i-1];
            max = Math.max(max,Math.max(prefix,sufix));
        }
        return max;
    }
}