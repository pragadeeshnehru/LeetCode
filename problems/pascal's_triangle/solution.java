class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows ==0) return result;

        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);

        for(int i=1; i<numRows ;i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for(int j = 1; j < i ;j++){
                currentRow.add(prevRow.get(j-1) + prevRow.get(j));
            }

            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }
}