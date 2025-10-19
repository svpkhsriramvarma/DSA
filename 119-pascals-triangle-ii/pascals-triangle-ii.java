class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) { 
            List<Integer> row = new ArrayList<>();
            if (i == 0) {
                row.add(1);
            } else {
                List<Integer> prev = res.get(i - 1);
                row.add(1);
                for (int j = 1; j < i; j++) {
                    row.add(prev.get(j - 1) + prev.get(j));
                }
                row.add(1);
            }
            res.add(row);
        }
        return res.get(res.size() - 1);
    }
}
