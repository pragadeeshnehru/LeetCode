class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for(int i =0;i<chars.length/2;i++) {
            char j = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = j;
        }

        for(int i=chars.length-1;i>=0;i--){
            if(chars[i] == '1') {
                char temp = chars[i];
                chars[i] = chars[chars.length-1];
                chars[chars.length-1] = temp;
                break;
            }
        }
        return new String(chars);
    }
}
