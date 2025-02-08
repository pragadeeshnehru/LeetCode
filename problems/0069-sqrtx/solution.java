class Solution {
    public int mySqrt(int num) {
        if(num==0 || num==1) return num;
        long start =0;
        long end = num/2;
        long mid =0;
        while(start <= end) {
            mid = start + (end -start)/2;
            if(mid*mid == num ) {
                return (int)mid;
            } else if( mid*mid > num) {
                end  = mid-1;
            } else {

                start = mid + 1;
                
            }   
        }
        return (int)end;
    }
}
