class Solution {
    public int[] finalPrices(int[] prices) {
        int[] arr=new int[prices.length];
        for(int i=0;i<arr.length;i++){
            int price=prices[i];
            for(int j=i+1;j<arr.length;j++){
                if(prices[j]<=prices[i]){
                    price=prices[i]-prices[j];
                    break;
                }
            }
            arr[i]=price;
        }
        return arr;
    }
}