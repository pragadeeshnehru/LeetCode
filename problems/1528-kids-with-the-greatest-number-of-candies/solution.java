class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int n = candies.length;
        for(int i=0;i<n;i++){
            max = Math.max(max,candies[i]);
            candies[i] += extraCandies;
        }
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<n;i++) {  
            if(candies[i] >= max){
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
