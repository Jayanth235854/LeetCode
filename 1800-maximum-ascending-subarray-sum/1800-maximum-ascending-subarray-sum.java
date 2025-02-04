class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0,sum=nums[0],n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1])sum+=nums[i+1];
            else{
                max=Math.max(sum,max);
                sum=nums[i+1];
            }
        }
        max=Math.max(max,sum);
        return max;
    }
}