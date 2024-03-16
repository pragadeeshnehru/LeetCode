class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int zeroes=0,ones=0,maxLen=0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0) zeroes++;else ones++;
            int diff = zeroes - ones;

            if(mp.containsKey(diff)) {
                // .get(diff) returns the index at which the diff was first encountered
                maxLen = Math.max(maxLen, i-mp.get(diff));
            } else {
                mp.put(diff,i);
            }
        }
        return maxLen;
    }
}
