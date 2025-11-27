class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rowMin = new int[m];
        for(int i = 0; i < m; i++) {
            int minVal = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++) {
                minVal = Math.min(minVal, matrix[i][j]);
            }
            rowMin[i] = minVal;
        }

        int[] colMax = new int[n];
        for(int j = 0; j < n; j++) {
            int maxVal = Integer.MIN_VALUE;
            for(int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, matrix[i][j]);
            }
            colMax[j] = maxVal;
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    ans.add(matrix[i][j]);
                }
            }
        }

        return ans;
    }
}
