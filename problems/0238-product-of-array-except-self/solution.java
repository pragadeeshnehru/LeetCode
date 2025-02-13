class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        int prod =1;
        for(int num : nums) {
            if(num!=0) prod *= num;
            else zero++;
        }

        for(int i =0;i<nums.length;i++) {
            if(zero>0) {
                if(nums[i] == 0 && zero >1 ) nums[i] = 0;
                else if(nums[i] == 0) nums[i] = prod;
                else nums[i] = 0;
            }else if(nums[i] != 0 && prod%nums[i] == 0){
                nums[i] = prod/nums[i];
            }  
        }

        return nums;
    }
}
