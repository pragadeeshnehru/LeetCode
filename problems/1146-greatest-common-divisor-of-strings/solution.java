class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if(n1<n2) 
            return gcdOfStrings(str2 , str1);
        if(str1.equals(str2))
            return str1;
        if (str1.startsWith(str2))
            return gcdOfStrings(str1.substring(n2), str2);
        return  "";
    }
}
