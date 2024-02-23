class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for(int i=0;i<s.length();i++){
            String s1 = expand(i,i,s);
            if(s1.length() > res.length()) res = s1;
            String s2 = expand(i,i+1,s);
            if(s2.length() > res.length()) res = s2;
        }
        return res;

    }

    public String expand(int l,int r,String s){
        while(l>=0 && r <s.length() && s.charAt(l)==s.charAt(r)){
            l -=1;
            r+= 1;
        }
        return s.substring(l+1,r);
    }
}