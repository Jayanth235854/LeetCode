class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n=nums.size(),sum=0;
        for(int i=0;i<n;i++){
            if(Integer.bitCount(i)==k)sum+=nums.get(i);
        }
        return sum;
    }
}