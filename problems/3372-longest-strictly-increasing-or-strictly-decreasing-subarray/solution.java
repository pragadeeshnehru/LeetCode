class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increase = 1;
        int maxi = 1;
        int maxd = 1;
        int decrease = 1;

        for(int i=0;i<nums.length -1;i++){
            if(nums[i] > nums[i+1]) {
                decrease++;
            } else {
                maxd  = Math.max(maxd, decrease);
                decrease = 1;
            }

            if(nums[i] < nums[i+1]) {
                increase++;
            } else {
                maxi  = Math.max(maxi, increase);
                increase = 1;
            }

        }
        maxd  = Math.max(maxd, decrease);
        maxi  = Math.max(maxi, increase);

        return maxi >= maxd ? maxi: maxd;
    }
}
