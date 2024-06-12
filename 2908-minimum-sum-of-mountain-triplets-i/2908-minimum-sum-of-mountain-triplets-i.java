class Solution {
    public int minimumSum(int[] nums) {
        int c=0,n=nums.length,min=500;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]<nums[j] && nums[k]<nums[j]){
                        c=nums[i]+nums[j]+nums[k];
                        if(c<min)min=c;
                    }
                }
            }
        }
        if(min==500)return -1;
        return min;
    }
}