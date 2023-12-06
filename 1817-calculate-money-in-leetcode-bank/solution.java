class Solution {
    public int totalMoney(int n) {
        int w= n/7;
        int total= w*28 + ((7*w*(w-1))/2);    //$28 per week
       
        
        if(n % 7 != 0) {
            int days = n % 7;
            int balance = w+1;
            for(int i=0;i<days;i++){
                total += balance;
                balance += 1;
            }
        }
        return total;
    }
}
