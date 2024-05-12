class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        int n=nums.length;
        for(int i:nums){
            sum+=i;
        }
        for(int i=n-1;i>1;i--){
            sum-=nums[i];
            if(nums[i]<sum){
                return nums[i]+sum;
            }
        }
        return -1;
    }
}