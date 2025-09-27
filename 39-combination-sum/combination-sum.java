class Solution {
    public static void findCombinations(List<List<Integer>> res,List<Integer> ans,int target,int start,int arr[]) {
        if(target == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = start;i < arr.length;i++) {
            if(target < arr[i])
                continue;
            ans.add(arr[i]);
            findCombinations(res,ans,target-arr[i],i,arr);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        findCombinations(res,ans,target,0,candidates);
        return res;
    }
}