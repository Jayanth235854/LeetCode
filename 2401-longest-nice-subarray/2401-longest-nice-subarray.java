class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length, count=1,max=1;
        for(int i=1;i<n;i++){
            if((nums[i] & nums[i-1])==0){
                count++;
                nums[i]=nums[i]|nums[i-1];
            }
            else count=1;
            max=Math.max(count,max);
        }
        return max;
    }
}