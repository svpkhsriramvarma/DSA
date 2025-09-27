class Solution {
    public static void solve(List<List<Integer>> res,List<Integer> ans,boolean flag[],int arr[]) {
        if(ans.size() == arr.length) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = 0;i < arr.length;i++) {
            if(flag[i]) continue;
            flag[i] = true;
            ans.add(arr[i]);
            solve(res,ans,flag,arr);
            flag[i] = false;
            ans.remove(ans.size()-1);
           
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean flag[] = new boolean[nums.length];
        solve(res,ans,flag,nums);
        return res;
    }
}