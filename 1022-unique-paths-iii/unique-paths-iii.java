class Solution {
    public static int solve(int grid[][],int s1,int s2,int g1,int g2,int rem,int n,int m) {
        if(s1 == g1 && s2 == g2)
            return rem == 0 ? 1 : 0;
            
        if(s1 < 0 || s2 < 0 || s1 >= n|| s2 >= m || grid[s1][s2] == -1)
            return 0;
        
        else {
            rem--;
            int temp = grid[s1][s2];
            grid[s1][s2] = -1;
            int count1 = solve(grid,s1+1,s2,g1,g2,rem,n,m);
            int count2 = solve(grid,s1-1,s2,g1,g2,rem,n,m);
            int count3 = solve(grid,s1,s2+1,g1,g2,rem,n,m);
            int count4 = solve(grid,s1,s2-1,g1,g2,rem,n,m);
            grid[s1][s2] = temp;
            rem++;
            return count1+count2+count3+count4;
        }
    }
    public int uniquePathsIII(int[][] grid) {
        int s1 = -1,s2 = -1,g1 = -1,g2 = -1,rem = 1;
        for(int i = 0;i < grid.length;i++) {
            for(int j = 0;j < grid[0].length;j++) {
                if(grid[i][j] == 1) {
                    s1 = i;
                    s2 = j;
                } else if(grid[i][j] == 2) {
                    g1 = i;
                    g2 = j; 
                } else if(grid[i][j] == 0) {
                    rem++;
                }
            }
        }
        return solve(grid,s1,s2,g1,g2,rem,grid.length,grid[0].length);
    }
}