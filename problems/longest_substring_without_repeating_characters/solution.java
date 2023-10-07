class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set= new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for(int right = 0; right<s.length(); right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen,right-left+1);
            } else {
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
        }
        return maxLen;
    }
}