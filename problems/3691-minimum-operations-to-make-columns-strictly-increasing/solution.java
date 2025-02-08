class Solution {
    public int minimumOperations(int[][] grid) {
        int n = grid.length;
        int count =0;
        for(int i=0;i<grid[0].length;i++) {
            for(int j=1;j<n;j++) {
                if(grid[j][i] <= grid[j-1][i]) {
                    int diff = grid[j-1][i] - grid[j][i]  + 1;
                    count += diff ;
                    grid[j][i] += diff;
                }
            }
        }
        return count;
    }
}
