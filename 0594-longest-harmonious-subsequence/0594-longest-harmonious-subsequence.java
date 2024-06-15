class Solution {
    public int findLHS(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i]-nums[i+1])==1){
                int count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==nums[i] || nums[j]==nums[i+1])count++;
                    else if(nums[j]>nums[i+1]) break;
                }
                if(count>max)max=count;
            }
        }
        return max;
    }
}