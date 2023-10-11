class Solution {
    public int climbStairs(int n) {
        int f1 =1,f2 =1, count =0;
        // implementing the fibonacci sequence
        int i = 2;
        if(n < 2) {
            return 1;
        } else  {
            while(i<=n){
                count = f1+f2;
                f1=f2;
                f2 = count;
                i++;
            }
        }
        return count;
    }
}