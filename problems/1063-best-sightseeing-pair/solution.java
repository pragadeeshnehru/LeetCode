class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int first = values[0] + 0;
        int ans = Integer.MIN_VALUE;
        int n = values.length;

        for (int j = 1; j < n; j++) {
            int second  =  values[j] - j;

            ans = Math.max(ans,first+second);

            first = Math.max(first, second + 2*j);
        }
        return ans;
    }
}
