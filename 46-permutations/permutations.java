class Solution {
    public static void solve(List<List<Integer>> res,List<Integer> ans,boolean flag[],int nums[],int size,int idx) {
        if(ans.size() == size) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = 0;i < size;i++) {
            if(flag[i]) continue;
            ans.add(nums[i]);
            flag[i] = true;
            solve(res,ans,flag,nums,size,idx+1);
            ans.remove(ans.size()-1);
            flag[i] = false;
            
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean flag[] = new boolean[nums.length];
        solve(res,ans,flag,nums,nums.length,0);
        return res;
    }
}