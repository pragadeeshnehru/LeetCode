class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //find transpose
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp= matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverse the order of elements in each row
        for(int i=0;i<n;i++){
            for (int j = 0; j < n / 2; j++) {   
            int t = matrix[i][j];
            matrix[i][j] = matrix[i][n - j - 1];
            matrix[i][n - j - 1] = t;
            }        
        }
    }
}
