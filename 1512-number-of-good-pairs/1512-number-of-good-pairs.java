class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int sum=0,c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])c++;
            else{
                if(c==1)continue;
                sum=sum+(c*(c-1))/2;
                c=1;
            }
        }
        if(c!=1)sum=sum+(c*(c-1))/2;
        return sum;
    }
}