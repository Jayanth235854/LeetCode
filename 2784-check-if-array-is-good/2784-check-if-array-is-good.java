class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n=nums[nums.length-1];
        if(n+1!=nums.length || nums.length==1)return false;
        int c=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=c)return false;
            c++;
        }
        return true;
    }
}