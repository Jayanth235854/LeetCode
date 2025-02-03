class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length, dec=1,inc=1;
        int max=Math.max(dec,inc);
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                inc++;
                max=Math.max(max,inc);
                dec=1;
            }
            else if(nums[i]>nums[i+1]){
                dec++;
                max=Math.max(max,dec);
                inc=1;
            }
            else{
                dec=1;inc=1;
            }
        }
        return max;
    }
}