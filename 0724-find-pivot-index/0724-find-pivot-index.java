class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0,add=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            if(i>0)add+=nums[i-1];
            sum-=nums[i];
            if(sum==add)return i;
        }
        return -1;
    }
}