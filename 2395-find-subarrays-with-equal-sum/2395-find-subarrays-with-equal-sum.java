class Solution {
    public boolean findSubarrays(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int sum=nums[i]+nums[i+1];
            for(int j=i+1;j<n-1;j++){
                int l=nums[j]+nums[j+1];
                if(sum==l)return true;
            }
        }
        return false;
    }
}