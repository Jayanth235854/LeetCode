class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        if(k<=numOnes)return k;
        else{
            sum+=numOnes;
            k=k-sum;
            if(k<=numZeros)return sum;
            else{
                k=k-numZeros;
                while(k>0){
                    k--;
                    sum--;
                }
            }
        }
        return sum;
    }
}