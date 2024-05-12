class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        total=0
        remain=0
        while(numBottles>0):
            total+=numBottles
            remain+=numBottles
            numBottles=remain//numExchange
            remain%=numExchange
        return total