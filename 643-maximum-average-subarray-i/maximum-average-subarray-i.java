class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0,i=0,n=nums.length,preSum = 0;
        double avg=0.0,maxAvg=0.0;
        while(i <k){
            preSum +=nums[i];
            i++;
        }
        maxAvg =preSum/(double)k;
        while(i < n){
            preSum = preSum - nums[s]+ nums[i];
            maxAvg = Math.max(preSum/(double)k, maxAvg);
            s++;
            i++;
        }
        return maxAvg;
    }
}