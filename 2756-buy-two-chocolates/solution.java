class Solution {
    public int buyChoco(int[] prices, int money) {
        int max = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int amt = prices[i]+prices[j];
                if(amt <= money){
                    max = Math.min(amt,max);
                }
            }
        }
        if(max==Integer.MAX_VALUE) {
            return money;
        }

        return money-max;
    }
}
