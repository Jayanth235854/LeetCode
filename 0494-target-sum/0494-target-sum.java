class Solution {
    int ans=0;
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        backtrack(nums,target,n,0,-1);
        return ans;
    }
    public void backtrack(int[] nums, int t, int n, int val,int i){
        i++;
        if(val==t && i==n)ans++;
        if(i==n)return;
        backtrack(nums,t,n,val+nums[i],i);
        backtrack(nums,t,n,val-nums[i],i);
    }
}