class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), ans, used);
        return ans;
    }

    private void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> ans, boolean[] used) {
        if (tempList.size() == nums.length && !ans.contains(tempList)) {
            ans.add(new ArrayList<Integer>(tempList));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if ((!tempList.contains(nums[i])) || (tempList.contains(nums[i]) && !used[i])) {
                    tempList.add(nums[i]);
                    used[i] = true;
                    backtrack(nums, tempList, ans, used);
                    used[i] = false;
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }
}
