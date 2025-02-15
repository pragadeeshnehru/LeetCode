class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int totalSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int left = i - k;
            int right = i + k;
            if ((left >= 0 && nums[i] <= nums[left]) || (right < n && nums[i] <= nums[right])) {
                continue;
            }

            totalSum += nums[i];
        }
        return totalSum;
    }
}
