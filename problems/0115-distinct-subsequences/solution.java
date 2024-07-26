class Solution {
    public int numDistinct(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        int dp[][] = new int[n1 + 1][n2 + 1];
        for (int row[] : dp)
            Arrays.fill(row,-1);
        return helper(s, t, n1 - 1, n2 - 1, dp);
    }

    private int helper(String s, String t, int i, int j, int[][] dp) {
        if (j < 0)
            return 1;
        if (i < 0)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];
        int res = 0;
        if (s.charAt(i) == t.charAt(j)) {
            res += helper(s, t, i - 1, j-1, dp);
        }
        res += helper(s, t, i - 1, j, dp);

        return dp[i][j] = res;
    }

}
