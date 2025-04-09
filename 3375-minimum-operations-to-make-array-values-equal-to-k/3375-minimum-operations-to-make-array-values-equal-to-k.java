class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        int count=n;
        Arrays.sort(nums);
        if(nums[0]<k)return -1;
        int i=0;
        while(i<n && nums[i]==k){
            count--; i++;
        }
        for(;i<n-1;i++){
            while(i<n-1 && nums[i]==nums[i+1]){
                count--;i++;
            }
        }
        if(count<0)return -1;
        return count;
    }
}