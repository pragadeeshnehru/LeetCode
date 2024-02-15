class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long curr = 0,peri = 0;
        // curr represnt sum of two smaller sides of triangle
        // peri represents sum of three sides of a triangle
        for (int i=0;i<nums.length;i++) {
            if(nums[i] < curr) {
                peri = curr + nums[i];
            }
            curr += nums[i];
        }
        return (peri == 0) ? -1 : peri;
    }
}
