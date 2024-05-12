class Solution {
    public int pivotInteger(int n) {
        int rhs=n*(n+1)/2;
        int lhs=0;
        for(int i=1;i<=n;i++){
            lhs+=i;
            rhs=rhs-i+1;
            if(lhs==rhs)return i;
        }
        return -1;
    }
}