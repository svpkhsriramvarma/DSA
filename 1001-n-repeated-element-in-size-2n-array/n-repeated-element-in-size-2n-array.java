class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int val : nums) {
            if (!set.add(val)) {
                return val;
            }
        }
        return -1;
    }
}
