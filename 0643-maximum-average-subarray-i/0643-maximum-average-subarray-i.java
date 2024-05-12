class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int right = k; right < n; right++) {
            sum += nums[right] - nums[right - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
}