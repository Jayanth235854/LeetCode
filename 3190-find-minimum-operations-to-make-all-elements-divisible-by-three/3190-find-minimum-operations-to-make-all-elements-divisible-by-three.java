class Solution {
    public int minimumOperations(int[] nums) {
        int count=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%3==0)continue;
            count++;
        }
        return count;
    }
}