class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int s=0,e=n-1;
        if(n==1)return nums[0];
        while(s<=e){
            if(nums[s]>nums[e])e--;
            else {
                int l=(e+1)%n;
                return nums[l];
            }
        }
        return 0;
    }
}