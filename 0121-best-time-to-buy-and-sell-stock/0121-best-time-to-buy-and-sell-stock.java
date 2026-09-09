class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;

        int tem[] = new int[len];

        int min = prices[0];
        for(int i = 0;i<len;i++){
            if(min>prices[i]){
                min = prices[i];
            }
            tem[i] = min;
        }

        int max = prices[len-1];
        for(int i = len-1;i>=0;i--){
            if(max<prices[i]){
                max = prices[i];
            }
            tem[i] = max-tem[i];
        }

        int ans = 0;
        for(int i = 0;i<len;i++){
            if(ans<tem[i]){
                ans = tem[i];
            }
        }
        return ans;

        
    }
}