class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length,j=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++)if(nums[i]!=0)arr[j++]=nums[i];
        return arr;
    }
}