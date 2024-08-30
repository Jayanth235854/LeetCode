class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length, max=piles[0];
        for(int i=1;i<n;i++)if(piles[i]>max)max=piles[i];
        int l=1,r=max, mid=0;
        while(l<r){
            mid=(l+r)/2;
            int totalHrs=0;
            for(int i=0;i<n;i++){
                totalHrs+=Math.ceil(piles[i]/(double)mid);
                if(totalHrs>h)break;
            }
            if(totalHrs<=h)r=mid;
            else l=mid+1;
        }
        return l;
    }
}