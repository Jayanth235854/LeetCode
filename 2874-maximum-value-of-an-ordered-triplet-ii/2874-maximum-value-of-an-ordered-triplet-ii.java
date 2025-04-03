class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long val=0,prefix_sum=nums[0];
        long[] suffix_sum=new long[n];
        suffix_sum[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix_sum[i]=Math.max(nums[i],suffix_sum[i+1]);
        }
        for(int i=1;i<n-1;i++){
            val=Math.max((prefix_sum-nums[i])*suffix_sum[i+1],val);
            prefix_sum=Math.max(nums[i],prefix_sum);
        }
        return val;
    }
}