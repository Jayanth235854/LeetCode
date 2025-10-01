class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int bot=numBottles, exc=numExchange;
        int total=bot, cur=bot;
        while(cur>=exc){
            total+=(cur/exc);
            cur=(cur/exc)+(cur%exc);
        }
        return total;
    }
}