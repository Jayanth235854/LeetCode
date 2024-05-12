int maxProfit(int* prices, int pricesSize) {
    int minprice=prices[0],maxprofit=0;
    for(int i=0;i<pricesSize;i++){
        if(prices[i]<minprice){
            minprice=prices[i];
        }
        if(prices[i]-minprice>maxprofit){
            maxprofit=prices[i]-minprice;
        }
    }
    return maxprofit;
}