class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=nums[0];
        for(int i:nums){
            sum+=i;
            if(sum<i)sum=i;
            max=Math.max(max,sum);
        }
        return max;
    }
}