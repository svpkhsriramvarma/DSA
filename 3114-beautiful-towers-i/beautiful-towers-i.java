class Solution {
    public long maximumSumOfHeights(int[] heights) {
        long ans = 0;
        for(int peek = 0;peek < heights.length;peek++) {
            long sum = heights[peek];
            //left
            long h = heights[peek];
            for(int i = peek-1;i >= 0;i--) {
                h = Math.min(h,(long)heights[i]);
                sum += h;
            }
            //right
            h = heights[peek];
            for(int i = peek+1;i < heights.length;i++) {
                h = Math.min(h,(long)heights[i]);
                sum += h;
            }

            ans = Math.max(ans,sum);
        }
        return ans;
    }
}