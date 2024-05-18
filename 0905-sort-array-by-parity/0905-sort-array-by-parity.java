class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int c=0;
        if(nums.length==1)return nums;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) {
                arr[c++]=nums[i];
                nums[i]=-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-1)continue;
            else arr[c++]=nums[i];
        }
        return arr;
    }
}