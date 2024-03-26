class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int n = nums.length;

        while(i<n) {
            int curr = nums[i] - 1;

            if(nums[i]>0 && nums[i] <n && nums[i]!=nums[curr]){
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
            } else {
                i++;
            }
        }

        for (int j=0;j<n;j++){
            if(nums[j]!= j+1){
                return j+1;
            }
        }
        return n+1;
    }
}
