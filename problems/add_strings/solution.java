class Solution {
    public String addStrings(String num1, String num2) {
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int carry = 0;
        String result = "";
        
        for(int i =0 ; i<num1.length() || i<num2.length() ; i++){
            int d1=0;
            int d2 =0;
            
            if(i<num1.length()){
                d1 = num1.charAt(i)- '0';
            }
            
            if(i<num2.length()){
                d2 = num2.charAt(i)- '0';
            }

            int sum = d1+d2+carry;
            int digit = sum % 10;
            carry = sum / 10;
            result = digit + result;

        }
        if(carry != 0){
            result = carry + result;
        }

    return result;
    }
}