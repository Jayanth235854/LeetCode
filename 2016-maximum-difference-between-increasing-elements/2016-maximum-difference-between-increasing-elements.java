class Solution {
    public int maximumDifference(int[] nums) {
       int n = nums.length;
       int maxDifference = -1; 
       int minSoFar = nums[0];
       for (int i = 1; i < n; i++) {
        if (nums[i] > minSoFar) {
            maxDifference = Math.max(maxDifference, nums[i]-minSoFar);
        } else {
            minSoFar = nums[i];
        }
       } 
       return maxDifference;
    }
}