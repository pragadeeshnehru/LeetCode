class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int least = nums[0] + nums[1] + nums[2];
        for(int i=0;i<n-2;i++) {
            int j= i+1;
            int k = nums.length -1;

            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(Math.abs(target-sum) < Math.abs(target - least)) {
                    least = sum;
                }
                if(sum == target) {
                    return sum;
                }
                if(sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return least;
    }
}