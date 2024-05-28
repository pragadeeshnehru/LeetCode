class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int curr_cost =0 ;
        int max_length = 0;
        int start = 0;

        for(int i=0; i<n;i++) {
            curr_cost += Math.abs((int)s.charAt(i) - (int)t.charAt(i));

            while(curr_cost > maxCost){
                curr_cost -= Math.abs((int)s.charAt(start) - (int)t.charAt(start));
                start++;
            }

            max_length = Math.max(max_length, i-start+1);
        }
        return max_length;
    }
}
