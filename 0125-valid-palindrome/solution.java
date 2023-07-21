class Solution {
    public boolean isPalindrome(String w) {
        int flag = 0;
        w = replaceCharacters(w);
        w = w.toLowerCase();

        StringBuilder s = new StringBuilder(w);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                s.deleteCharAt(i);
                i--;
            }
        }

        for(int i=0;i < s.length();i++){
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            flag = 1;
            break;
           }
        }

        if(flag == 1){
            return false;
        }

        return true;
    }

    public String replaceCharacters(String str){
        String result = str.replaceAll("[^a-zA-Z0-9]"," ");
        return result;
    }


}
