class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        String result = "";
        boolean isNegative = (num < 0);
        num = Math.abs(num);

        while(num > 0) {
            result = num%7 + result;
            num /= 7;
        }
        return isNegative ? '-' + result : result;
    }
}
