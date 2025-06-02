class Solution {
    public int uniquePaths(int[][] grid) {
        // code here
                int n = grid.length;
        if (n == 0) return 0;
        int m = grid[0].length;
        if (m == 0) return 0;
        
        int[][] dp = new int[n][m];
        
        // Initialize the starting cell
        dp[0][0] = grid[0][0] == 0 ? 1 : 0;
        
        // Fill the first column
        for (int i = 1; i < n; i++) {
            if (grid[i][0] == 0 && dp[i-1][0] == 1) {
                dp[i][0] = 1;
            } else {
                dp[i][0] = 0;
            }
        }
        
        // Fill the first row
        for (int j = 1; j < m; j++) {
            if (grid[0][j] == 0 && dp[0][j-1] == 1) {
                dp[0][j] = 1;
            } else {
                dp[0][j] = 0;
            }
        }
        
        // Fill the rest of the dp table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (grid[i][j] == 0) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        
        return dp[n-1][m-1];
    }
};