class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
                int n = nums.length;
        int mod = 1000000007;
        int[][] dp = new int[n + 1][target + 1];
        
        // Base case: one way to make sum 0 (empty subset)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        
        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int sum = 0; sum <= target; sum++) {
                if (nums[i - 1] <= sum) {
                    dp[i][sum] = (dp[i - 1][sum] + dp[i - 1][sum - nums[i - 1]]) % mod;
                } else {
                    dp[i][sum] = dp[i - 1][sum];
                }
            }
        }
        
        return dp[n][target];
    }
}