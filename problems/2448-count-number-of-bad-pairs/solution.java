class Solution {
    public long countBadPairs(int[] nums) {
        int n =  nums.length;
        long count = (long) n * (n-1) /2;
        Map<Integer, Long> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            int diff = nums[i] - i;
            count -= map.getOrDefault(diff, 0L);
            map.put(diff, map.getOrDefault(diff, 0L) +1);
        }
        return count;
    }
}
