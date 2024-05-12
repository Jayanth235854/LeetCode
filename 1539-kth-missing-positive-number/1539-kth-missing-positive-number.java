class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int prev = 0;
        
        for (int num : arr) {
            int diff = num - prev - 1;
            if (missingCount + diff >= k) {
                return prev + k - missingCount;
            }
            missingCount += diff;
            prev = num;
        }
        return arr[arr.length - 1] + k - missingCount;
    }
}