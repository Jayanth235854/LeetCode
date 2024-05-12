class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3)return -1;
        else return nums[1];
    }
}