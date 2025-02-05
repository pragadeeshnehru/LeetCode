class Solution {
    public String removeTrailingZeros(String num) {
        int i = num.length()-1;
        int count =0;
        while(num.charAt(i) == '0'){
            count++;
            i--;
        }

        return num.substring(0,num.length()-count);
    }
}
