class Solution {
    private boolean search(int[] arr,int n, int target) {
        int low =0 ,high = n-1;
        while(low<=high) {
            int mid = low+ (high-low)/2;
            if(arr[mid] == target) return true;
            else if(arr[mid] < target) low = mid+1;
            else high = mid -1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        for(int i=0;i<m;i++) {
            if(search(matrix[i],n,target)) {
                return true;
            }
        }
        return false;

    }
}
