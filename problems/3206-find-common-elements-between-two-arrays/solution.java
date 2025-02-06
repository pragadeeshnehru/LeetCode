class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count=0;
        int ans[]=new int[2];
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i]==nums2[j]) {
                    count++;
                    break;
                }
            }
        }
        
        ans[0]=count;
        count=0;
        for(int i=0;i<nums2.length;i++) {
            for(int j=0;j<nums1.length;j++) {
                if(nums1[j]==nums2[i]) {
                    count++;
                    break;
                }
            }
        }
        ans[1]=count;
        return ans;
    }
}
