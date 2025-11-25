class Solution {
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(left < right) {
            int h = Math.min(height[left],height[right]);
            int with = right-left;
            maxArea = Math.max(maxArea,h*with);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}