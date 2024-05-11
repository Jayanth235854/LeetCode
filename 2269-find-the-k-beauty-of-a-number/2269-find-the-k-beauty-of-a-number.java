class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=Integer.toString(num);
        int n=s.length(),count=0;
        int[] arr=new int[n];
        int l=num;
        for(int i=n-1;i>=0;i--){
            arr[i]=l%10;
            l/=10;
        }
        for(int i=0;i<n;i++){
            int len=i+k-1;
            if(len<n){
                int kl=0;
                for(int j=i;j<=len;j++){
                    kl=kl*10+arr[j];
                }
                if(kl==0)continue;
                if(num%kl==0)count++;
            }
        }
        return count;
    }
}