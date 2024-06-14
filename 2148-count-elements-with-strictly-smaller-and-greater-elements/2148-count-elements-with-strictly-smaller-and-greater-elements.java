class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3)return 0;
        int max=nums[nums.length-1],min=nums[0],count=nums.length-2;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==min || nums[i]==max)count--;
        }
        return count;
    }
}