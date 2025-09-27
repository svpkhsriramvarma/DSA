class Solution {
    public static void solve(HashSet<List<Integer>> set, List<Integer> ans, int target, int start, int arr[], boolean flag[]) {
        if (target == 0) {
            set.add(new ArrayList<>(ans));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) continue; 
            if (arr[i] > target) break; 

            if (flag[i]) continue;
            flag[i] = true;
            ans.add(arr[i]);
            solve(set, ans, target - arr[i], i + 1, arr, flag); 
            flag[i] = false;
            ans.remove(ans.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        HashSet<List<Integer>> set = new HashSet<>();
        boolean flag[] = new boolean[candidates.length];
        List<Integer> ans = new ArrayList<>();
        solve(set, ans, target, 0, candidates, flag);
        return new ArrayList<>(set);
    }
}
