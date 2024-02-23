class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
       
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] fl : flights) {
            int currSrc = fl[0], neigh = fl[1], neighDistFromSrc = fl[2];
            graph.computeIfAbsent(currSrc, key -> new ArrayList<>()).add(new int[]{neigh, neighDistFromSrc});
        }
        
        int[] distFromSource = new int[n];
        Arrays.fill(distFromSource, Integer.MAX_VALUE);
        Queue<int[]> que = new LinkedList<>();
        int minLen = Integer.MAX_VALUE, stops = 0;
        
        que.offer(new int[]{src, 0});
        while (!que.isEmpty() && stops <= k) {
            int size = que.size();
            while (size-- > 0) {
                int[] currPr = que.poll();
                for (int[] neigh : graph.getOrDefault(currPr[0], new ArrayList<>())) {
                    if (distFromSource[neigh[0]] > currPr[1] + neigh[1]) {
                        distFromSource[neigh[0]] = currPr[1] + neigh[1];
                        if (neigh[0] == dst)
                            minLen = Math.min(minLen, distFromSource[neigh[0]]);
                        que.offer(new int[]{neigh[0], distFromSource[neigh[0]]});
                    }
                }
            }
            stops++;
        }
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}