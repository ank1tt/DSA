
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/

class Solution {
    public int maxProfit(int[] prices) {
       // initiate with the min value.
        int minP = Integer.MAX_VALUE;
        int maxP = 0; // MAX PROFIT.
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minP){   // if prices is less than the min then we replace the min with the price.
                minP = prices[i];
            } else if(prices[i] - minP > maxP){  // if we see a profit then we update the max profit.
                maxP = prices[i] - minP;
            }
            
        }
        return maxP;
    }
}
