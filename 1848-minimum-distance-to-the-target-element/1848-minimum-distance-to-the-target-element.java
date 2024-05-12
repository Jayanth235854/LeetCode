class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int mini=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int k=Math.abs(i-start);
                if(k<mini)mini=k;
            }
        }
        return mini;
    }
}