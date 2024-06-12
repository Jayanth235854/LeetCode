class Solution {
    public long maximumTripletValue(int[] nums) {
        int c=0,max=0,n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    c=(nums[i]-nums[j])*nums[k];
                    if(c>max)max=c;
                }
            }
        }
        if(max<0)return 0;
        return max;
    }
}