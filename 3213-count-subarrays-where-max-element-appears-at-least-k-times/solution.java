class Solution {
    public long countSubarrays(int[] nums, int k) {
        long maxNum = Long.MIN_VALUE, count =0;
        long left = 0, right=0, ans = 0 ;

        for(int num : nums) {
            maxNum = Math.max(maxNum, num);
        }

        while(right<nums.length || left > right) {
            if(nums[(int)right] == maxNum) {
                count++;
            }

            while(count >= k) {
                if(nums[(int)left] == maxNum) {
                    count--;
                }
                left++;
                ans+= nums.length-right;
            }
            right++;
        }  
        return ans;
    }
}
