class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=1,c=1,n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                c++;
                if(c>max)max=c;
            }
            else c=1;
        }
        return max;
    }
}