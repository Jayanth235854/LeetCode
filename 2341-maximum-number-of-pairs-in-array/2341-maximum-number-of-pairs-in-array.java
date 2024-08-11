class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n=nums.length,pair=0, leftover=0;
        int[] arr=new int[101];
        for(int i=0;i<n;i++)arr[nums[i]]++;
        int[] ans=new int[2];
        for(int i=0;i<101;i++){
            int p=arr[i]/2, l=arr[i]%2;
            pair+=p;
            leftover+=l;
        }
        ans[0]=pair;ans[1]=leftover;
        return ans;
    }
}