class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length,c=0,one=0;
        for(int i=0;i<n;i++)if(nums[i]==1)one++;
        for (int i = 0; i < one; i++) c+= nums[i];
        int max = c;
        for (int i = one; i < n+ one; i++) {
            c += nums[i % n] - nums[(i - one + n) % n];
            max = Math.max(max, c);
        }
        return one - max;
    }
}