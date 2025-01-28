class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (grid[0][0] == 1 || grid[m-1][n-1] == 1) return 0;
        int[][] dp =new int[m][n];

        dp[0][0] = 1;

        for (int col = 1; col < n; col++) {
            if(grid[0][col] == 1) {
                dp[0][col] = 0;
            } else{
                dp[0][col] = dp[0][col-1];
            }
            
        }

        for (int row = 1; row < m; row++) {
            if(grid[row][0] == 1) {
                dp[row][0] = 0;
            } else {
                dp[row][0] = dp[row-1][0];
            }
           
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(grid[i][j] == 1)  {
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];

    }
}
