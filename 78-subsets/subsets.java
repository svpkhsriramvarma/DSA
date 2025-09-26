class Solution {
    public static void result(List<List<Integer>> res, List<Integer> ans,int i,int arr[]) {
        if(i == arr.length) {
            res.add(new ArrayList<>(ans));
            return;
        }

        ans.add(arr[i]);
        result(res,ans,i+1,arr);
        ans.remove(ans.size()-1);
        result(res,ans,i+1,arr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        result(res,ans,0,nums);
        return res;
    }
}