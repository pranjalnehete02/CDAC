/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */
 // 7   1   5  3   6  4
// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int min_price = 0;
        int min_index = 0;
        int maxProfit = 0 ;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < prices[i+1]){
                min_price = prices[i];
                min_index = i;
            }
            else{
                min_price = prices[i + 1];
                min_index = i + 1;
            }
        }

        //min_index = prices[min_price];
        for (int i = min_index + 1; i < prices.length; i++){
            if(prices[i] < prices[i+1]){
                maxProfit = prices[i+1] - prices[i];
            }
            
        }
        return maxProfit;
    }
}
// @lc code=end

