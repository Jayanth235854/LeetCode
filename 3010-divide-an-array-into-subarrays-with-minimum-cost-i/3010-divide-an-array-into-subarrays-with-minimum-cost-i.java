class Solution {
    public int minimumCost(int[] nums) {
        if(nums.length==3)return (nums[0]+nums[1]+nums[2]);
        int sum=nums[0];
        int min=nums[1],index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                index=i;
            }
        }
        sum+=min;
        nums[index]=100;
        min=nums[1];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        sum+=min;
        return sum;
    }
}