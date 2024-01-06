class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(answer, new ArrayList<>(),candidates,target,0);
        return answer;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int []nums, int remain, int start) {
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else {
            for(int i= start ; i<nums.length;i++){
                tempList.add(nums[i]);
                backtrack(list,tempList, nums, remain-nums[i], i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}