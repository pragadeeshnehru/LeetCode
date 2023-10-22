class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
        // '^' XOR OPERATION RETURNS 0 WHEN A NUMBER IS XORED WITH ITSELF AND THE NUMBER ITSELF WHEN XORED WITH 0
        // THE XOR APPROACH IS ONLY VALID UNDER THE ASSUMPTION THAT ALL ELEMENTS EXCEPT ONE OCCURS TWICE AS GIVE IN DESC.
        for(int i=0;i<nums.length;i++){
            ans = ans^nums[i];
        }
        return ans;
    }
}