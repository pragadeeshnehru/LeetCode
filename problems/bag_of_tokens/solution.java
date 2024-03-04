class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score =0;
        Arrays.sort(tokens);
        int l=0;
        int max=0;
        int r=tokens.length -1;

        while (l<=r) {
            if(power >= tokens[l]){
                power -= tokens[l];
                score++;
                l++;
                max = Math.max(score,max);
            } else if(score >= 1){
                power += tokens[r];
                score--;
                r--;
            } else  {
                break;
            }
        }    
        return max;
    }
}