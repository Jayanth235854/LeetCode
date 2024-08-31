class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n=nums.length,s=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)continue;
            for(int j=0;j<n;j++){
                if(i!=j && nums[i]==nums[j]) {
                    nums[j]=0;
                    s^=nums[i];
                }
            }
        }
        if(s!=0)return s;
        return 0;
    }
}