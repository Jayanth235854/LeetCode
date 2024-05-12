class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftsum=0,rightsum=0,n=nums.length;
        for(int i=0;i<n;i++){
            rightsum+=nums[i];
        }
        for(int i=0;i<n;i++){
            rightsum-=nums[i];
            if(leftsum==rightsum)return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}