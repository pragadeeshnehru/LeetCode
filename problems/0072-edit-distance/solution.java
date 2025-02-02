class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] memo = new int[m+1][n+1];

        for(int i=0;i<=m;i++) {
            memo[i][n] = m-i;
        }

        for(int i=0;i<=n;i++) {
            memo[m][i] = n-i;
        }

        for(int i=m-1;i>=0;i--){
            for(int j = n-1;j>=0;j--) {
                if(word1.charAt(i) == word2.charAt(j)){
                    memo[i][j] = memo[i+1][j+1]; 
                } else {
                    memo[i][j] = Math.min(memo[i+1][j+1],Math.min(memo[i+1][j],memo[i][j+1])) + 1;
                }
            }
        }
        return memo[0][0];
    }
}
