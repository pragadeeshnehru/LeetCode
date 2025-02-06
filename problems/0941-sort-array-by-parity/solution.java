class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int first =0;
        int last = nums.length-1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2==0) {
                ans[first] = nums[i];
                first++;
            } else {
                ans[last] = nums[i];
                last--;
            }
        }
        return ans;
    }
}
