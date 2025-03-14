class Solution {
    public int maximumCandies(int[] candies, long k) {
        int min=candies[0],max=candies[0];
        for(int i=1;i<candies.length;i++){
            min=Math.min(min,candies[i]);
            max=Math.max(max,candies[i]);
        }
        //if(min>=k && k<=candies.length)return min;
        System.out.println(max);
        int left=1,right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            System.out.println(left+" "+right+" "+mid);
            if(possible(candies,mid,k))left=mid+1;
            else right=mid-1;
        }
        System.out.println(left+" "+right);
        return right;
    }
    public boolean possible(int[] candies, int mid,long k){
        int count=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]/mid!=0)count=count+candies[i]/mid;
        }
        if(count>=k)return true;
        return false;
    }
}