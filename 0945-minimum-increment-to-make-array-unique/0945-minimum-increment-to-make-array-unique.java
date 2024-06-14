class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count=0,n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i+1]++;
                count++;
            }else if(nums[i]>nums[i+1]){
                int a=nums[i+1];
                nums[i+1]=nums[i]+1;
                count+=nums[i+1]-a;
            }
        }
        return count;
    }
}