class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count=0,n=nums.length,j=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                count++;
                j=i;
            }
        }
        if(count>1)return false;
        else if(count==1){
            if(j==0)return true;
            if(nums[j-1]<nums[j+1])return true;
            else return false;
        }
        return true;
    }
}