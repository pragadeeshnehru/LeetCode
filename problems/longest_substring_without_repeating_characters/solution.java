class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count =0;
        for (int i=0; i< s.length(); i++){
            String ans = new String();
            for (int j=i; j <s.length(); j++){
                if (!ans.contains(Character.toString(s.charAt(j)))){
                    ans += s.charAt(j);
                }else {
                    break;
                }
            }
            count = Math.max(count, ans.length());
        }
        return count;
    }
}