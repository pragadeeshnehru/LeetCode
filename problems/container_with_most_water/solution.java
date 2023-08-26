class Solution {
    public int maxArea(int[] height) {
        int maximumArea = Integer.MIN_VALUE;
        //initializing two pointer variables
        int left =0;
        int right = height.length -1;

        while(left<right){
            int shortLine = Math.min(height[left],height[right]);
            maximumArea = Math.max(maximumArea,shortLine *(right-left));

            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maximumArea;
    }
}