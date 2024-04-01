class Solution {
    public int lengthOfLastWord(String s) {
        int last_idx = s.length()-1;
        while(s.charAt(last_idx) == ' '){
            last_idx--;
        }
        int len = 0;    
        while(last_idx >= 0 && s.charAt(last_idx) != ' '){
            len++;
            last_idx--;
        }
        return len;
    }
}
