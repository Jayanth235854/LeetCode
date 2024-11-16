class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int s=n-k+1, c=0;
        int[] ans=new int[s];
        for(int i=k;i<=n;i++){
            int max=nums[i-k],br=0;
            for(int j=i-k;j<i-1;j++){
                if(nums[j]<nums[j+1]) max=Math.max(nums[j],nums[j+1]);
                else{
                    ans[c++]=-1;
                    br=1;
                    break;
                }
            }
            if(br==0)ans[c++]=max;
        }
        return ans;
    }
}