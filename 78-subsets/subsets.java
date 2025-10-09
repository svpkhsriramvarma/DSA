class Solution {
    public static void solve(int nums[], List<Integer> ans, List<List<Integer>> res, int n,int i) {
        if (i == n) {
            res.add(new ArrayList(ans));
            return;
        }

        ans.add(nums[i]);
        solve(nums, ans, res, n,i+1);
        ans.remove(ans.size() - 1);
        solve(nums, ans, res, n,i+1);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, ans, res, nums.length,0);
        return res;
    }
}