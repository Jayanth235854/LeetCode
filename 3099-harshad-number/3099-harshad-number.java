class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x,digit=0;
        while(n>0){
            digit=digit+n%10;
            n/=10;
        }
        if(x%digit==0)return digit;
        return -1;
    }
}