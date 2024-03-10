class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq =  new int[1001];
        int[] ans = new int[1001];
        int j=0;
        for(int i:nums1){
            freq[i] = -1;
        }

        for(int i:nums2){
            if(freq[i] == -1){
                ans[j++] =i;
                freq[i] = 1;
            }
        }

        int[] res = new int[j];
        for(int i=0;i<res.length;i++){
            res[i] =ans[i];
        }
        return res;
    }
}
