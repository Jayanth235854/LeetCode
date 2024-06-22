class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int s = 0,ans = 0,n=nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] %= 2;
        }
        int[] prefixCount = new int[n+1];
        prefixCount[0] = 1;
        for (int num : nums) {
            s += num;
            if (s >= k) {
                ans += prefixCount[s - k];
            }
            prefixCount[s]++;
        }
        return ans;
    }
}