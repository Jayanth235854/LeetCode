class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int n=0,k=0;
        while(nums[nums.length-1]>0){
            if(nums[n++]>0){
                k=nums[n-1];
            }else continue;
            for(int i=0;i<nums.length;i++){
                nums[i]=nums[i]-k;
            }
            count++;
        }
        return count;
    }
}