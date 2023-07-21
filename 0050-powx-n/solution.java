class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }

        if(n == Integer.MAX_VALUE){
            return x;
        }
        
        if(n == Integer.MIN_VALUE){
            x *= x;
            n /= 2;
        }

        if(n < 0){
            x=1/x;
            n*=-1;
        }
        double ans = 1;
        while(n>0){
            if(n%2 ==1)
                ans = ans * x; 
            x *= x;
            n /= 2;  
        }
        return ans; 
    }
}
