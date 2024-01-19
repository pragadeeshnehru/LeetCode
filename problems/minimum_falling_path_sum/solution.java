class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        for( int i = 1; i<r; i++) {
            for( int j =0; j<c; j++) {
                int a = matrix[i][j];
                if(j==0) matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j], matrix[i-1][j+1]);
                else if(j==c-1) matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j-1], matrix[i-1][j]);
                else matrix[i][j] = matrix[i][j] +Math.min(matrix[i-1][j+1], Math.min(matrix[i-1][j-1], matrix[i-1][j])); 
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i< matrix.length;i++) {
            if(matrix[matrix.length-1][i] < min ) {
                min = matrix[matrix.length-1][i];
            }
        }

        return min;
    }
}