class Solution {
    public int[] circularGameLosers(int n, int k) {
        int[] arr=new int[n];
        int l=0,i=1,count=0;
        arr[0]=1;
        while(arr[l]!=2){
            count=count+i*k;
            l=count%n;
            arr[l]++;
            i++;
        }
        int c=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0)c++;
        }
        int[] ans=new int[c];
        c=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0)ans[c++]=j+1;
        }
        return ans;
    }
}