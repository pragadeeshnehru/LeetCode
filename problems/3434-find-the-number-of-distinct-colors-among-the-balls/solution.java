class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> ballColor = new HashMap<>();
        HashMap<Integer, Integer> colorCount = new HashMap<>();
        HashSet<Integer> distinctColors = new HashSet<>();
        int[] result = new int[queries.length];
        for(int i=0;i< queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            if(ballColor.containsKey(ball)) {
                int oldColor = ballColor.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor) -1);

                if(colorCount.get(oldColor) == 0) {
                    distinctColors.remove(oldColor);
                }
            }

            ballColor.put(ball,color);
            colorCount.put(color, colorCount.getOrDefault(color, 0) +1);
            distinctColors.add(color);

            result[i] = distinctColors.size();
        }
        return result;
    }
}
