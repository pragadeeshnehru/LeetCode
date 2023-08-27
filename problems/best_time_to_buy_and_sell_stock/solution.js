/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let buy = 0; // We always buy for the least value..
    let sell = 1;
    let totalProfit = 0;
        while(sell<prices.length){
            if(prices[buy] < prices[sell]) {
                let profit = prices[sell] - prices[buy];
                totalProfit = Math.max(totalProfit,profit);
            } else {
                // ...so we update it incase it is greater than sell value
                buy = sell;
            }
            sell++;
        }
        return totalProfit;


};