class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length,count=0;
        long pre=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=0;i<n-1;i++){
            pre+=nums[i];
            sum-=nums[i];
            if(pre>=sum)count++;
        }
        return count;
    }
}