class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length, startValue=1;
        int a=startValue;
        for(int i=0;i<n;i++){
            a=a+nums[i];
            if(a<1){
                startValue++;
                a=startValue;
                i=-1;
            }
        }
        return startValue;
    }
}