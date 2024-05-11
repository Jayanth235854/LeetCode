class Solution {
    public int[] evenOddBit(int n) {
        int odd=0,even=0,cons=0;
        while(n>0){
            if(n%2==1){
                if(cons%2==0)even++;
                else odd++;
            }
            n/=2;
            cons++;
        }
        int[] arr=new int[2];
        arr[0]=even;
        arr[1]=odd;
        return arr;
    }
}