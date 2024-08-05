class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0, n=arr.length, presum=0,mid;
        for(int i=0;i<n;i++)sum+=arr[i];
        for(int i=0;i<n-2;i++){
            presum+=arr[i];
            sum-=arr[i];
            int midsum=0;
            int endsum=sum;
            for(int j=i+1;j<n-1;j++){
                midsum+=arr[j];
                endsum-=arr[j];
                if(presum==midsum && midsum==endsum)return true;
            }
        }
        return false;
    }
}