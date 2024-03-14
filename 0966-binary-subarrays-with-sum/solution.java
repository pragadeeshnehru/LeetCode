class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        //by finding number of sun=barrys with sum <= goal ans subtracting it with sum <=goal-1 we compute count count og sum == goal
        return atMost(nums,goal)-atMost(nums, goal-1);
    }

    private int atMost(int[] nums,int goal){
        int head, tail=0,sum=0,result=0;
        for(head =0;head<nums.length;head++){
            sum += nums[head];
            while(sum > goal && tail <= head) {
                sum-= nums[tail];
                tail++;
            }
            // finding number of subarray of sum atmost equal to goal
            result += head - tail +1;
        }
        return result;
    }
}
