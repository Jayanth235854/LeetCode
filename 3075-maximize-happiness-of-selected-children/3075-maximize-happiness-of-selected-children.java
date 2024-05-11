class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int l=0,dec=0;
        long c=0;
        for(int i=happiness.length-1;i>=0;i--){
            if(l==k)break;
            happiness[i]=happiness[i]-dec;
            dec++;
            if(happiness[i]<=0)continue;
            c+=happiness[i];
            happiness[i]=0;
            l++;
        }
        return c;
    }
}