class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int stRow = 0,stCol = 0;
        int edRow = matrix.length-1,edCol = matrix[0].length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(stRow <= edRow && stCol <= edCol) {
            //top
            for(int i = stCol;i <= edCol;i++) {
                list.add(matrix[stRow][i]);
            }
            //right
            for(int i = stRow+1;i <= edRow;i++) {
                list.add(matrix[i][edCol]);
            }
            //bottom
            for(int i = edCol-1;i >= stCol;i--) {
                if(stRow == edRow) break;
                list.add(matrix[edRow][i]);
            }
            //left
            for(int i = edRow-1;i > stRow;i--) {
                if(stCol == edCol) break;
                list.add(matrix[i][stCol]);
            }
            stRow++;
            stCol++;
            edRow--;
            edCol--;

        }
        return list;
    }
}