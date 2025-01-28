class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= n-1; j++) {
                if (i == n - 1) {
                    dp[i][j] = matrix[i][j];
                } else {
                    if (j == 0) {
                        dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + matrix[i][j];
                    } else if (j == n - 1) {
                        dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j - 1]) + matrix[i][j];
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i + 1][j], dp[i + 1][j - 1]), dp[i+1][j+1]) + matrix[i][j];
                    }
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(dp[0][i] < min){
                min = dp[0][i];
            }
        }

        return min;
    }
}
