class Solution {
    public int dominantIndex(int[] nums) {
        int max=0,index=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i==index)continue;
            if(max/2<nums[i])return -1;
        }
        return index;
    }
}