class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long max=0,c;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    c=((long)nums[i]-(long)nums[j])*nums[k];
                    max=Math.max(max,c);
                }
            }
        }
        if(max<0)return 0;
        return max;
    }
}