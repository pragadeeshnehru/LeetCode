class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
         Set<String> set = new HashSet<>(wordDict);
         int[] memo = new int[s.length()];
         Arrays.fill(memo,-1);
         return wb(s, set, 0, memo);
    }
    private boolean wb(String s , Set<String> set, int start, int[] memo) {
        if(start >= s.length()){
            return true;
        }
        if(memo[start] != -1){
            return memo[start] == 1;
        }

        for(int i=start+1;i<=s.length();i++){
            if(set.contains(s.substring(start,i)) && wb(s,set,i,memo)){
                memo[start] = 1;
                return true;
            }
        }
        memo[start] = 0;
        return false;
    }
}
