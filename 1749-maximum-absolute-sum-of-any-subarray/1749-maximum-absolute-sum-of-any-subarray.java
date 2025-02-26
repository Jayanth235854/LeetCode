class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length,max_cur=nums[0], min_cur=nums[0], max=nums[0], min=nums[0];
        for(int i=1;i<n;i++){
            max_cur=Math.max(nums[i],max_cur+nums[i]);
            max=Math.max(max,max_cur);
            min_cur=Math.min(nums[i],min_cur+nums[i]);
            min=Math.min(min,min_cur);
        }
        return Math.max(max, Math.abs(min));
    }
}