class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s =  "";
        int i =0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                s+=(word1.charAt(i));
            }

            if(i<word2.length()){
                s+=(word2.charAt(i));
            }
            i++;
        }
        return s;
    }
}
