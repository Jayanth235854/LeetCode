class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<m*k)return -1;
        int max=bloomDay[0];
        for(int i=1;i<n;i++)if(bloomDay[i]>max)max=bloomDay[i];
        int l=0, r=max,min=-1;
        while(l<=r){
            int mid=(l+r)/2;
            int bc=0,nfc=0;
            for(int i=0;i<n;i++){
                if(bloomDay[i]<=mid)nfc++;
                else nfc=0;
                if(nfc==k){
                    bc++;
                    nfc=0;
                }
                if(bc==m)break;
            }
            if(bc<m)l=mid+1;
            else {
                min=mid;
                r=mid-1;
            }
        }
        return min;
    }
}