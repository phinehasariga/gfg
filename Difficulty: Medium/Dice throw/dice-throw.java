class Solution {
    static int noOfWays(int m, int n, int x) {
        // code here
                int[][] dp = new int[n + 1][x + 1];
        
        // Base case: with 1 die, there's 1 way to get sum j where 1 <= j <= m
        for (int j = 1; j <= m && j <= x; j++) {
            dp[1][j] = 1;
        }
        
        // Fill the DP table for more than 1 die
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= x; j++) {
                // For each sum j, consider all possible face values k (1 to m) of the ith die
                for (int k = 1; k <= m && k < j; k++) {
                    dp[i][j] += dp[i - 1][j - k];
                }
            }
        }
        
        return dp[n][x];
    }
}