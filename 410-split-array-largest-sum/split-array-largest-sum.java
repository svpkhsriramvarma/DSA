class Solution {
    public static int findMax(int nums[]) {
        int max = Integer.MIN_VALUE;
        for(int val : nums) {
            if(max < val) {
                max = val;
            }
        }
        return max;
    }
    public static int findSum(int arr[]) {
        int sum = 0;
        for(int val : arr) {
            sum += val;
        }
        return sum;
    }

    public static int findCount(int nums[],int max) {
        int count = 1,val = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] > max)
                return Integer.MAX_VALUE;
            if(val+nums[i] <= max)
                val+=nums[i];
            else {
                val = nums[i];
                count++;
            }
        }
        return count;
    }

    public int splitArray(int[] nums, int k) {
        int low = findMax(nums);
        int high = findSum(nums);
        int res = high;
        while(low <= high) {
            int mid = (low+high)/2;
            int count = findCount(nums,mid);

            if(count <= k) {
                res = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return res;
    }
}