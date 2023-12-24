class Solution {
    public int minOperations(String s) {
        int count =0;
        int n = s.length();
        if(n == 1 ){
            return 0;
        }

        for(int i =0;i<n;i++) {
            if(s.charAt(i) == '0' && i%2 == 1) count++;
            if(s.charAt(i) == '1' && i%2 == 0) count++;
        }
        return Math.min(count, n-count);
    }
}