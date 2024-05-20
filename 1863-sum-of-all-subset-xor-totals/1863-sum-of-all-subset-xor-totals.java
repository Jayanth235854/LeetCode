class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0,n=nums.length;
        for(int i=0;i<n;i++){
            sum|=nums[i];
        }
        return sum<<(n-1);
    }
}