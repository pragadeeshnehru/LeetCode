class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];


        for (int row = n-1; row >=0; row--) {
            for (int col = 0; col <= row; col++) {
                if(row == n-1) {
                    dp[row][col] = triangle.get(row).get(col);
                } else {
                    dp[row][col] = Math.min(dp[row+1][col], dp[row+1][col+1]) + triangle.get(row).get(col);
                }
            }
        }
        return dp[0][0];
    }
}
