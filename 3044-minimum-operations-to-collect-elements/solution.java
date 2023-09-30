class Solution {
    public int minOperations(List<Integer> nums, int k) {
        List<Integer> list = new ArrayList<>();
  
        int count = 0;
        for(int i = nums.size()-1;i>=0;i--){
            int val = nums.get(i);
           
            if(val>=1 && val<=k && !list.contains(val)){
                list.add(val);
        
            }
    
            if(list.size()==k){
                break;
            }

            count++;
            
        }
        return count+1;
    }
}
