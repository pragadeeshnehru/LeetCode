class Solution {
    public int maxAscendingSum(int[] nums) {
        int currsum = nums[0];
        int maxsum = currsum;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currsum += nums[i];
            } else {
                currsum = nums[i];
            }
            maxsum = Math.max(maxsum, currsum);

        }
        return maxsum;
    }
}
