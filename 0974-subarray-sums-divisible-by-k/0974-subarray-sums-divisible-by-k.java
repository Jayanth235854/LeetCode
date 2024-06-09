class Solution {
    public int subarraysDivByK(int[] nums, int k) {  
    int ans = 0,prev = 0;
    int[] count = new int[k];
    count[0] = 1;
    for (final int num : nums) {
      prev = (prev + num % k + k) % k;
      ans += count[prev];
      ++count[prev];
    }
    return ans;
  }
}