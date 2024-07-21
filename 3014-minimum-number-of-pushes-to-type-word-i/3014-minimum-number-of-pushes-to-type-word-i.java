class Solution {
    public int minimumPushes(String word) {
        int sum=0,n=word.length();
        if(n>24){
            sum = sum+(n-24)*4;
            sum+=48;
        }else if(n>16){
            sum = sum+(n-16)*3;
            sum+=24;
        }else if(n>8){
            sum=sum+(n-8)*2;
            sum+=8;
        }else sum+=n;
        return sum;
    }
}