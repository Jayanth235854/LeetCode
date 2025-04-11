class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String a=Integer.toString(i);
            int n=a.length();
            if(n%2==1)continue;
            String t1=a.substring(0,n/2);
            String t2=a.substring(n/2);
            int n1=Integer.valueOf(t1);
            int n2=Integer.valueOf(t2);
            int sum1=0,sum2=0;
            while(n1>0){
                sum1=sum1+n1%10;
                sum2=sum2+n2%10;
                n1/=10; n2/=10;
            }
            if(sum1==sum2)count++;
        }
        return count;
    }
}