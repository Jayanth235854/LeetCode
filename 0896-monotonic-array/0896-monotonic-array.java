class Solution {
    public boolean isMonotonic(int[] nums) {
        int incount=1,decount=1,n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1])incount++;
            else if(nums[i]>nums[i+1])decount++;
            else {
                incount++;
                decount++;
            }
        }
        if(incount==n)return true;
        if(decount==n)return true;
        return false;
    }
}