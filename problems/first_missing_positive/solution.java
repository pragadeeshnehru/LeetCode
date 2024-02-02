class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int n = nums.length;
        
        //store positive integer n in n-1 index eg .. 1 in 0, 3 in 2
        while(i<n) {
            // current index
            int curr = nums[i] - 1;

            if(nums[i]>0 && nums[i]<n && nums[i] != nums[curr]){
                //swap values
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
            } else {
                i++;
            }
        }
        
        // return the missing number
        for(int j=0;j<n;j++){
            if(nums[j] != j+1) {
                return j+1;
            }
        }

        // return n+1 number if all +ve int from 1 to n are present  
        return n+1;
    }
}