class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max=0,r=nums.length;
        for(int i=0;i<r;i++){
            int c=0;
            if(nums[i]>threshold)continue;
            if(nums[i]%2==0){
                c++;
                int j=i;
                while(j < r-1 && nums[j]%2 !=nums[j+1]%2){
                    if(nums[j]>threshold || nums[j+1]>threshold)break;
                    c++;
                    j++;
                    if(j==r-1)break;
                }
            }
            if(c>max)max=c;
        }
        return max;
    }
}