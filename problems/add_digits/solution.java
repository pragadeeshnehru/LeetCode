class Solution {
    public int addDigits(int num) {
        int sum=num;
        while(num >=9){
            sum = 0;
            while(num>0){
                sum = sum + (num % 10);
                num = num /10;
            }
            if(sum >= 10){
                num = sum;
            }
        }   
        return sum;
    }
}