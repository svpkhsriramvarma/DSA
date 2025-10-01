class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0;i < nums.length;i++) {
            // if(map.get(nums[i]) != null && map.get(nums[i]) == -1)
            //     continue;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) > 1) {
                return nums[i];
            }
        }
        return -1;
    }
}