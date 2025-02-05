class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length() ) return false;

        if(s1.equals(s2)) return true;
        int count =0;
        int firstIndex =-1, secondIndex=-1;
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                count++;
                if(count == 1) {
                    firstIndex = i;
                } else if(count == 2){
                    secondIndex = i;
                } else {
                    return false;
                }
            }
        }
        return count == 2 && s1.charAt(firstIndex) == s2.charAt(secondIndex) && s1.charAt(secondIndex) == s2.charAt(firstIndex);

    }
}
