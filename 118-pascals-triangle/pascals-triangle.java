class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < numRows;i++) {
            List<Integer> ans = new ArrayList<>();
            for(int j = 0;j <= i;j++) {
                if(j == 0 || j== i)
                    ans.add(1);
                else  {
                    List<Integer> list = res.get(i-1);
                    int sum = list.get(j-1)+list.get(j);
                    ans.add(sum);
                }
            }
            res.add(new ArrayList<>(ans));
        }
        return res;
    }
}