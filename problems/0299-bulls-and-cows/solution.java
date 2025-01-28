class Solution {
    public String getHint(String secret, String guess) {
        int bulls =0;
        int cows =0;
        
        int[] secretCount = new int[10]; 
        int[] guessCount = new int[10]; 

        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                secretCount[secret.charAt(i) -'0']++;
                guessCount[guess.charAt(i) -'0']++;
            }
        }

        for(int i=0;i<10;i++) {
            cows += Math.min(secretCount[i], guessCount[i]);
        }

        String ans = bulls+"A"+cows+"B";
        return ans;
    }
}
