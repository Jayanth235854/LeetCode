class Solution {
    private int robb(int[] arr,int ind,int n){
        int[] dp=new int[n];
        dp[ind]=arr[ind];
        dp[ind+1]=Math.max(arr[ind],arr[ind+1]);
        for(int i=ind+2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        if(n==2) return 0;
        return Math.max(robb(nums,0,n-1), robb(nums,1,n));
    }
}