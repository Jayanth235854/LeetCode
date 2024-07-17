class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1,dec=1,n=nums.length;
        for(int i=0;i<n-1;i++){
            int incre=1;
            for(int j=i;j<n-1;j++){
                if(nums[j]>nums[j+1])incre++;
                else break;
            }
            if(incre>inc)inc=incre;
        }
        for(int i=0;i<n-1;i++){
            int decre=1;
            for(int j=i;j<n-1;j++){
                if(nums[j]<nums[j+1])decre++;
                else break;
            }
            if(decre>dec)dec=decre;
        }
        return dec>inc?dec:inc;
    }
}