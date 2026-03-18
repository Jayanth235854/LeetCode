class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int poss1=nums[0]*nums[n-1]*nums[n-2];
        int poss2=nums[n-3]*nums[n-2]*nums[n-1];
        int poss3=nums[0]*nums[1]*nums[n-1];
        int poss4=nums[0]*nums[1]*nums[2];
        int max1=Math.max(poss1,poss2);
        int max2=Math.max(poss3,poss4);
        return Math.max(max1,max2);
    }
}