class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0) return list;
        int first = nums[0];
        int second = nums[0];
        for(int i = 1;i < nums.length;i++) {
            if(nums[i] != 1+second) {
                if(first == second)
                    list.add(first+"");
                else
                    list.add(first+"->"+second);
                first = nums[i];
                second = nums[i];
                continue;
            }
            second = nums[i];
        }
        if(first == second)
            list.add(first+"");
        else
            list.add(first+"->"+second);
        return list;
    }
}