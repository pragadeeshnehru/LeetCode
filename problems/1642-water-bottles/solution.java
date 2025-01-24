class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maxBottles = numBottles;
        while(numBottles >= numExchange){
            int full = numBottles / numExchange ;
            maxBottles += full;
            numBottles = full + numBottles % numExchange;
        }
        return maxBottles;
    }
}
