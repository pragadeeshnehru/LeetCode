class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        int bad_idx =-1, left_idx=-1, right_idx =-1;

        for (int i=0;i<nums.length;i++) {
            if(!(minK <= nums[i] && nums[i] <= maxK)) {
                bad_idx = i;
            }

            if (nums[i] == minK) {
                left_idx = i;

            }

            if (nums[i] == maxK) {
                right_idx = i;
            }

            res += Math.max(0,Math.min(left_idx,right_idx) - bad_idx);
        }
        return res;
    }
}
