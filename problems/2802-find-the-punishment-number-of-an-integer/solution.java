class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++) {
            int square = i*i;

            sum += punishment(square,i)  ?  square: 0;
        }
        return sum;
    }
    private boolean punishment(int num, int target) {
        if(num < target || target < 0) return false;
        if(num == target) return true;

        return (punishment(num/10, target-(num%10))) || (punishment(num/100, target-(num%100))) || (punishment(num/1000, target-(num%1000)));
    }

}
