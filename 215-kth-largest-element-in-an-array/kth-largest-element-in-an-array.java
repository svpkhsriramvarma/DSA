class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int val : nums) {
            if(minHeap.size() < k)
                minHeap.add(val);
            else if(val > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(val);
            }
        }  
        return minHeap.peek(); 
    }
}