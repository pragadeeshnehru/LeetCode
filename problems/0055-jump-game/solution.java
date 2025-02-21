class Solution {
    public boolean canJump(int[] nums) {
        int jump =0;
        for(int num : nums) {
            if(jump<0) return false;
            if(num > jump) jump = num;
            jump--;
        }
        return true;
    }
}
