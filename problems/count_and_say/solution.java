class Solution {
    public String countAndSay(int n) {
        if(n==1) {
            return "1";
        }
        String prev  = countAndSay(n-1);
        String ans = "";
        int freq =1;
        for(int i =0 ;i < prev.length();i++) {
            if(i == prev.length()-1 || prev.charAt(i) != prev.charAt(i+1)){
                ans += freq;
                ans += prev.charAt(i);
                freq = 1;
            } else {
                freq ++;
            }
        }
        return ans;
    }
}