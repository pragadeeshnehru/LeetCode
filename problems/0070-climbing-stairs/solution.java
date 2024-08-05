class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 1);
        memo.put(2, 2);
        return recursion(n, memo);
    }

    private int recursion(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        memo.put(n, recursion(n - 1, memo) + recursion(n - 2, memo));
        return memo.get(n);
    }
}
