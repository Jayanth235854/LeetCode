class Solution {
    public int minCapability(int[] nums, int k) {
        int min=Integer.MAX_VALUE, max=0,n=nums.length;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int left=min,right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(help(nums,mid,k))right=mid-1;
            else left=mid+1;
        }
        return left-1;
    }
    public boolean help(int[] nums,int mid,int k){
        int n=nums.length,total=0;
        for(int i=0;i<n;i++){
            if(nums[i]<mid){
                i++;
                total++;
            }
        }
        if(total>=k)return true;
        return false;
    }
}