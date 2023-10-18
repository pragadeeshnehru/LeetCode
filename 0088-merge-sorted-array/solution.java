class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        for(int i=0,k=m;i<n;i++){
            nums1[k] = nums2[i];
            k++;
        }
        Arrays.sort(nums1);
    }
}
