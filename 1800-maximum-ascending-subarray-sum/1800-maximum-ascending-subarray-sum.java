class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0;
        if(nums.length==1)return nums[0];
        for(int i=0;i<nums.length-1;i++){
            int sum=0;
            while(nums[i]<nums[i+1]){
                sum+=nums[i];
                i++;
                if(i==nums.length-1)break;
            }
            sum+=nums[i];
            if(max<sum)max=sum;
        }
        return max;
    }
}