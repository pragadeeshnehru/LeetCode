class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character,Character> map = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)) return false;
            } else if(map.containsValue(t.charAt(i))) return false;
            map.put(s.charAt(i) , t.charAt(i));
        }
        return true;
    }
}
