class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        Arrays.sort(happiness);
        int i=n-1,l=0;
        long sum=0;
        while(l<k){
            if(i>=0 && happiness[i]-l<=0)return sum;
            sum+=(long)(happiness[i--])-l;
            l++;
        }
        return sum;
    }
}