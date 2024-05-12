class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k)c++;
        }
        for(int i=0;i<nums.length;i++){
            int pro=nums[i];
            for(int j=i+1;j<nums.length;j++){
                pro=pro*nums[j];
                if(pro<k)c++;
                else break;
            }
        }
        return c;
    }
}