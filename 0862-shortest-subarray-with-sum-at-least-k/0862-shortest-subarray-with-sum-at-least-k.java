public class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] prefixSum = new long[n + 1];  // Prefix sum array
        Deque<Integer> deque = new ArrayDeque<>();  // Monotonic deque
        // Build prefix sum array
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        int result = Integer.MAX_VALUE;  // To store the length of the shortest subarray
        for (int i = 0; i <= n; i++) {
            // Try to find a subarray with sum >= k
            while (!deque.isEmpty() && prefixSum[i] - prefixSum[deque.peekFirst()] >= k) {
                result = Math.min(result, i - deque.pollFirst());
            }
            // Maintain the deque (monotonic increasing order of prefix sums)
            while (!deque.isEmpty() && prefixSum[i] <= prefixSum[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
