class Solution {
    public int maxProfit(int[] prices) {
        int c=0,n=prices.length;
        for(int i=0;i<n-1;i++){
            if(prices[i]<prices[i+1])c+=prices[i+1]-prices[i];
        }
        return c;
    }
}