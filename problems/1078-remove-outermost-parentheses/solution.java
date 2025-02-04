class Solution {
    public String removeOuterParentheses(String s) {
        int openCount = 0;
        String res = new String();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                openCount++;
                if (openCount > 1) res+= "(";
            } else {
                if(openCount > 1) res+=  ")";
                openCount--;
            }
        }
        return res;
    }
}
