class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int sum=0,n=nums.length,left=0;
        for(int i=0;i<n;i++)sum+=nums[i];
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=n-1;i>=0;i--){
            sum-=nums[i];
            left+=nums[i];
            if(left<=sum)ans.add(nums[i]);
            if(left>sum){
                ans.add(nums[i]);
                break;
            }
        }
        return ans;
    }
}