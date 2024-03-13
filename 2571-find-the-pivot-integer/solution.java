class Solution {
    public int pivotInteger(int n) {
        int totalSum = 0;
        for (int i = 1; i <= n; i++)  totalSum += i;
        
        for (int x = 1; x <= n; x++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 1; i < x; i++) leftSum += i;
            for (int i = x + 1; i <= n; i++) rightSum += i;
            if (leftSum == rightSum) return x;
        }
        return -1;
    }
}


