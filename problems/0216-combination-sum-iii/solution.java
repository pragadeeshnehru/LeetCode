    class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 1;
        findCom(k, n, i, ans, new ArrayList<>());
        return ans;
    }

    private void findCom(int k, int n, int start, List<List<Integer>> ans, List<Integer> ds) {
        if (ds.size() == k) {
            if (n == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > n) {
                break;
            }
            if (ds.contains(i)) {
                i++;
            }
            ds.add(i);
            findCom(k, n - i, i + 1, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
