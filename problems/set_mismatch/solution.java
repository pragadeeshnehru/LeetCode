class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] result= new int[2];
        for(int i=1;i<=nums.length;i++) {
            int count=0;
            for(int j=0;j<nums.length;j++) {
                if(nums[j] ==i) {
                    count++;
                }
            }
            if(count == 2){
                result[0] = i;
            } else if(count == 0){
                result[1] = i;
            }
        }
        return result;
    }
}