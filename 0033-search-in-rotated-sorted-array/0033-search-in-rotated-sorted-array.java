class Solution {
    public int binary(int[] arr,int target,int s,int e){
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]>target)e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>nums[n-1])l=mid+1;
            else r=mid-1;
        }
        int mid=l;
        int ans=binary(nums,target,0,mid-1);
        if(ans!=-1)return ans;
        return binary(nums,target,mid, n-1);
    }
}