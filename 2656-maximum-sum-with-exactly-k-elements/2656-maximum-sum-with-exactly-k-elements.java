class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=nums[n-1];
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+l+i;
        }
        return sum;
    }
}