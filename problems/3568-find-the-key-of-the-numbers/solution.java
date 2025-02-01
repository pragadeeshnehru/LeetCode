class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int i=0, place =1, ans =0;
        while(i<4) {
            int minVal = Math.min(num1%10, Math.min(num2%10, num3%10));
            ans += minVal * place;
            num1/=10;
            num2/=10;
            num3/=10;
            place*=10;
            i++;
        }
        return ans;
    }
}
