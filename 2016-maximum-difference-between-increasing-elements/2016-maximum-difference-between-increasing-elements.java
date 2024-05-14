class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1,n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]){
                    int k=nums[j]-nums[i];
                    if(max<k)max=k;
                }
            }
        }
        return max;
    }
}