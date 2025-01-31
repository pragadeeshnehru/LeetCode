class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        Arrays.fill(dp,false);
        dp[0] =true;

        for(int i=1;i<=n;i++){
            for(String w : wordDict) {
                int start = i - w.length();
                if(start >= 0 && dp[start] && s.substring(start,i).equals(w)) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
