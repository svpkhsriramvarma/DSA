class NumMatrix {
    int prfix[][];

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            prfix = new int[1][1];
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        prfix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                prfix[row][col] = matrix[row][col];

                if (row > 0)
                    prfix[row][col] += prfix[row - 1][col];

                if (col > 0)
                    prfix[row][col] += prfix[row][col - 1];

                if (row > 0 && col > 0)
                    prfix[row][col] -= prfix[row - 1][col - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int sum = prfix[row2][col2];

        if (row1 > 0)
            sum -= prfix[row1 - 1][col2];

        if (col1 > 0)
            sum -= prfix[row2][col1 - 1];

        if (row1 > 0 && col1 > 0)
            sum += prfix[row1 - 1][col1 - 1];

        return sum;
    }
}