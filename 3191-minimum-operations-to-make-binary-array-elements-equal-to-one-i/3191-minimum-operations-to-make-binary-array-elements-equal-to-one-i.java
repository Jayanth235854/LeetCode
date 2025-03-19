class Solution {
    public int minOperations(int[] nums) {
        int count=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1)continue;
            if(nums[i]==0 && i+2<n){
                nums[i]=1;
                if(nums[i+1]==0) nums[i+1]=1;
                else nums[i+1]=0;
                if(nums[i+2]==0) nums[i+2]=1;
                else nums[i+2]=0;
                count++;
            }else return -1;
        }
        return count;
    }
}