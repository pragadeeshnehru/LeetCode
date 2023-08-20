class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);

        // int haylength=haystack.length();
        // int needlelength=needle.length();
        // if(haylength<needlelength)
        //     return -1;
        // for(int i=0;i<=haystack.length()-needle.length();i++){
        //     int j=0;
        //     while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
        //         j++;
        //     if(j==needle.length()){
        //         return i;
        //     }
        // }
        // return -1;


    }
}