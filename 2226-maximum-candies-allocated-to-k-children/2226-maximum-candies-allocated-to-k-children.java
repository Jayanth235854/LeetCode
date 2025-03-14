class Solution {
    public int maximumCandies(int[] candies, long k) {
        int min=candies[0],max=candies[0];
        for(int i=1;i<candies.length;i++){
            min=Math.min(min,candies[i]);
            max=Math.max(max,candies[i]);
        }
        int left=1,right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(possible(candies,mid,k))left=mid+1;
            else right=mid-1;
        }
        return right;
    }
    public boolean possible(int[] candies, int mid,long k){
        long count=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]/mid!=0)count=count+candies[i]/mid;
        }
        if(count>=k)return true;
        return false;
    }
}