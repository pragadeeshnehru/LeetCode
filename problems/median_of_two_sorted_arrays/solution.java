class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int []nums3 = new int[m+n];
        int i=0,j=0,k=0;
        while (i<m && j <n)
        {
            
            if (nums1[i] < nums2[j])
                nums3[k++] = nums1[i++];
            else
                nums3[k++] = nums2[j++];
        }

        while (i < m)
            nums3[k++] = nums1[i++];
     
        while (j < n)
            nums3[k++] = nums2[j++];

        int mid = nums3.length/2;

        if(nums3.length%2 == 0){
            return (double)(nums3[mid]+nums3[mid-1]) / 2;
           
        }

        return nums3[mid]; 
    }

}