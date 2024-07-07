class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles, exchange=numBottles/numExchange, remain=numBottles%numExchange;
        while(exchange >0){
            count+=exchange;
            exchange+=remain;
            remain=exchange%numExchange;
            exchange=exchange/numExchange;
        }
        return count;
    }
}