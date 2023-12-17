class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[grid.length*grid.length];
        int[] result = new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(ans[grid[i][j]-1] == 0){
                    ans[grid[i][j]-1]= grid[i][j];
                } else {
                    ans[grid[i][j]-1]= grid[i][j];
                    result[0] = grid[i][j];
                }
            }
        }

        for(int i=0;i<ans.length;i++){
            if(ans[i] == 0) {
                result[1] = i+1; 
            }
        }

        return result;
    }
}