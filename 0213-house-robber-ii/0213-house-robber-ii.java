class Solution {
    private int robb(int[] arr,int ind,int n){
        int prev=arr[ind], curr=Math.max(arr[ind],arr[ind+1]), next=0;
        for(int i=ind+2;i<n;i++){
            next=Math.max(curr, prev+arr[i]);
            prev=curr;
            curr=next;
        }
        return curr;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        return Math.max(robb(nums,0,n-1), robb(nums,1,n));
    }
}