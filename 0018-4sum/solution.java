class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) { 
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++) {
            for(int l = nums.length-1;l>=i+3;l--) {
                int j = i+1;
                int k = l-1;
                
                while(j<k) {
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l] ;
                    if(sum == target ) {
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        if(!(answer.contains(temp))){
                            answer.add(temp);
                        }     
                    }
                    if(sum < target) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        return answer;
    }
}
