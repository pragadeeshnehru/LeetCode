class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int n : nums) {
            if (n > max)
                max = n;
        }

        int[] sums = new int[max + 1];
        for (int n : nums) {
            sums[n] += n;
        }

        int oneStepOut = 0, twoStepOut = 0;
        for (int i = max; i >= 0; --i) {
            int maxValue = Math.max(oneStepOut, sums[i] + twoStepOut);
            twoStepOut = oneStepOut;
            oneStepOut = maxValue;
        }
        return oneStepOut;
    }
}
