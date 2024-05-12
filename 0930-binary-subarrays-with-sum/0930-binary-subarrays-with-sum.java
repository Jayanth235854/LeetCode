class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        int count = 0;
        int sum = 0;
        for (int num : nums) {
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
            sum += num;
            count += prefixSumCount.getOrDefault(sum - goal, 0);
        }
        return count;
    }
}