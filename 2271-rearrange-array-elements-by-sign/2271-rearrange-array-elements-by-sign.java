class Solution {
    public int[] rearrangeArray(int[] nums) {
        int j=0,k=1;
        int[] num=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                num[j]=nums[i];
                j+=2;
            }
            if(nums[i]<0){
                num[k]=nums[i];
                k+=2;
            }
        }
        return num;
    }
}