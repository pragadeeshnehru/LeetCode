class Solution {
    public boolean equalFrequency(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Count the frequency of frequencies
        Map<Integer, Integer> freqCount = new HashMap<>();
        for (int count : map.values()) {
            freqCount.put(count, freqCount.getOrDefault(count, 0) + 1);
        }

        // If there's only one frequency, we can always make frequencies equal by
        // removing one character
        if (freqCount.size() == 1) {
            int freq = freqCount.keySet().iterator().next();
            return freq == 1 || map.size() == 1;
        }

        // If there are more than two frequencies, it's impossible to make frequencies
        // equal by removing one character
        if (freqCount.size() != 2) {
            return false;
        }

        // Check if we can make frequencies equal by removing one character
        int[] keys = freqCount.keySet().stream().mapToInt(Integer::intValue).toArray();
        int minFreq = Math.min(keys[0], keys[1]);
        int maxFreq = Math.max(keys[0], keys[1]);

        // Case 1: One character has a frequency of 1, and all others have the same
        // frequency
        if (minFreq == 1 && freqCount.get(minFreq) == 1) {
            return true;
        }

        // Case 2: One character has a frequency one greater than the others, and only
        // one such character exists
        if (maxFreq - minFreq == 1 && freqCount.get(maxFreq) == 1) {
            return true;
        }

        return false;
    }
}
