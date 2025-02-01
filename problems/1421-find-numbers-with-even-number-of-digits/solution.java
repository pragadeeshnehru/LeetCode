class Solution {
    public int findNumbers(int[] nums) {
        int evenCount =0;
        for(int num : nums){
            int digitCount=0;
            while(num >0) {
                digitCount++;
                num/=10;
            }
            if(digitCount % 2 ==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
