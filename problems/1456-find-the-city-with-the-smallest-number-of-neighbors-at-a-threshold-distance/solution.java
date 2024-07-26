class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int minCities = 0;
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            map.get(edge[0]).add(new int[] { edge[1], edge[2] });
            map.get(edge[1]).add(new int[] { edge[0], edge[2] });
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int res = 0, max = n;
        for (int i = 0; i < n; i++) {
            pq.add(new int[] { i, 0 });
            int[] visit = new int[n];
            int[] dis = new int[n];

            Arrays.fill(dis, Integer.MAX_VALUE);
            dis[i] = 0;
            int count = 0;
            while (!pq.isEmpty()) {
                int[] cur = pq.poll();
                int city = cur[0], curdis = cur[1];
                if (visit[city] == 1) {
                    continue;
                }

                count++;
                visit[city] = 1;
                for (int[] next : map.get(city)) {
                    int nextcity = next[0], nextdis = next[1] + curdis;
                    if (nextdis <= distanceThreshold && nextdis < dis[nextcity]) {
                        pq.add(new int[] { nextcity, nextdis });
                        dis[nextcity] = nextdis;
                    }
                }
            }
            if(count<= max) {
                max=count;
                res=i;
            }
        }
        return res;
    }
}
