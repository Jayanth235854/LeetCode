class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < k) return 0;  // if the array size is less than k, there's no valid subarray
        
        long maxSum = 0, currentSum = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        // Initialize the first window
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }
        
        // If all elements in the first window are distinct, set it as the maximum sum
        if (freqMap.size() == k) {
            maxSum = currentSum;
        }
        
        // Slide the window across the rest of the array
        for (int i = k; i < n; i++) {
            // Remove the element going out of the window
            int outNum = nums[i - k];
            freqMap.put(outNum, freqMap.get(outNum) - 1);
            if (freqMap.get(outNum) == 0) {
                freqMap.remove(outNum);
            }
            
            // Add the new element into the window
            int inNum = nums[i];
            freqMap.put(inNum, freqMap.getOrDefault(inNum, 0) + 1);
            currentSum += inNum - outNum;
            
            // Check if the window has all distinct elements
            if (freqMap.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }
}
