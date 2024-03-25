class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList();
        int[] freq = new int[nums.length+1];
        for(int num : nums){
            freq[num]++;
        }

        for(int i =0;i<freq.length;i++){
            if(freq[i]>=2) result.add(i);
        }
        return result;
    }
}
