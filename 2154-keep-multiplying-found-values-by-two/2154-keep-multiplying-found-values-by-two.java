class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=1;
        while(n==1){
            int c=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==original){
                    c++;
                    original=original*2;
                }
            }
            if(c==0)n=0;
        }
        return original;
    }
}