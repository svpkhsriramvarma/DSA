class Solution {
    public static void solve(int nums[],List<List<Integer>> res,List<Integer> ans,boolean flag[]) {
        if(ans.size() == nums.length) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = 0;i < nums.length;i++) {
            if(flag[i]) continue;
            ans.add(nums[i]);
            flag[i] = true;
            solve(nums,res,ans,flag);
            ans.remove(ans.size()-1);
            flag[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean flag[] = new boolean[nums.length];
        solve(nums,res,ans,flag);
        return res;   
    }
}