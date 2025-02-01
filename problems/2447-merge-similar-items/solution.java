class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> cnt = new TreeMap<>();
        Stream.of(items1).forEach(item ->cnt.put(item[0],item[1]));
        Stream.of(items2).forEach(item ->cnt.merge(item[0],item[1], Integer::sum));
        return cnt.entrySet().stream().map(e->Arrays.asList(e.getKey(),e.getValue())).collect(Collectors.toList());
    }
}
