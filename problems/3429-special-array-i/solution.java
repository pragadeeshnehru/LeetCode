class Solution {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length == 1)
            return true;
        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if ((nums[i] + nums[j]) % 2 == 0) {
                return false;
            }
            i++;
            j++;
        }

        return true;
    }
}
