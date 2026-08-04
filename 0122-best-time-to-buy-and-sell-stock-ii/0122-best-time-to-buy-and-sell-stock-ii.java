class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int min = prices[0];
        int profit = 0;

        for(int i = 1;i<len;i++){
            if(min > prices[i]){
                min = prices[i];
            }
            else{
                //profit possible
                profit+= (prices[i] - min);
                min = prices[i];
            }
        }

        return profit;
    }
}