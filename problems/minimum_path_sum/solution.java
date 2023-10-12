class Solution {
    public int minPathSum(int[][] cost) {
        int m = cost.length;
        int n = cost[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = cost[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + cost[i][0];
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + cost[0][i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = cost[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m - 1][n - 1];
    }

}