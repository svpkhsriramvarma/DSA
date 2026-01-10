class Solution {
    public static int solve(String s1, String s2, int i, int j, int[][] dp) {
        if (i == -1) {
            int asscii = 0;
            for (int m = 0; m <= j; m++) { 
                asscii += (int) s2.charAt(m);
            }
            return asscii;
        }
        if (j == -1) {
            int accii = 0;
            for (int m = 0; m <= i; m++) { 
                accii += (int) s1.charAt(m);
            }
            return accii;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = solve(s1, s2, i - 1, j - 1, dp);
        } else {
            dp[i][j] = Math.min(
                (int) s1.charAt(i) + solve(s1, s2, i - 1, j, dp),
                (int) s2.charAt(j) + solve(s1, s2, i, j - 1, dp)
            );
        }

        return dp[i][j];
    }

    public int minimumDeleteSum(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        int[][] dp = new int[len1][len2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return solve(s1, s2, len1 - 1, len2 - 1, dp);
    }
}
