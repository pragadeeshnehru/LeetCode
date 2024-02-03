class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        int maxFreq = 0, cntFreq =0;
        for (int frq : freq.values()) {
            if (frq == maxFreq) cntFreq++;
            else if (frq > maxFreq) {
                maxFreq = frq;
                cntFreq = 1;
            }
        }
        return maxFreq * cntFreq;
    }    
}
