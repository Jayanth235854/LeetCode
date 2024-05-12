class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int[] arr = new int[divisors.length];
        for (int i = 0; i < divisors.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num % divisors[i] == 0) {
                    count++;
                }
            }
            arr[i] = count;
        }
        int maxScore = 0;
        int maxDivisor = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxScore) {
                maxScore = arr[i];
                maxDivisor = divisors[i];
            } else if (arr[i] == maxScore) {
                maxDivisor = Math.min(maxDivisor, divisors[i]);
            }
        }
        
        return maxDivisor;
    }
}