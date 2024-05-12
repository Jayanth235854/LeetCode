class Solution {
    public int alternateDigitSum(int n) {
        int count=0,sum=0,odd=0,m=n;
        while(m>0){
            m/=10;
            odd++;
        }
        if(odd%2==0){
            while(n>0){
                int digit=n%10;
                if(count%2==0)sum-=digit;
                else sum+=digit;
                count++;
                n/=10;
            }
        } else{
            while(n>0){
                int digit=n%10;
                if(count%2==0)sum+=digit;
                else sum-=digit;
                count++;
                n/=10;
            }
        }
        return sum;
    }
}