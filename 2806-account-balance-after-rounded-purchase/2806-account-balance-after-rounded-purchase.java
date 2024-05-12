class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int k=purchaseAmount/10;
        if(purchaseAmount%10>=5)return (100-(k*10+10));
        else return (100-(k*10));
    }
}