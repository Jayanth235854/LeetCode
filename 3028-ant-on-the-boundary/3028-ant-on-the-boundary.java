class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum=0,count=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum==0)count++;
        }
        if(count!=0)return count;;
        return 0;
    }
}