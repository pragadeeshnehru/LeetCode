class Solution {
    int m, n;
    public int solve(int i, int j, int[][] grid, boolean[][] vis) {
        if (i < 0 || i >= m || j < 0 || j >= n || vis[i][j] || grid[i][j] == 0) return 0;
        int temp = grid[i][j];
        vis[i][j] = true;
        temp += solve(i + 1, j, grid, vis);
        temp += solve(i - 1, j, grid, vis);
        temp += solve(i, j + 1, grid, vis);
        temp += solve(i, j - 1, grid, vis);
        return temp;
    }
    
    public int findMaxFish(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int ans = 0;
        boolean[][] vis = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0 && !vis[i][j]) {
                    ans = Math.max(ans, solve(i, j, grid, vis));
                }
            }
        }
        return ans;
    }
}
