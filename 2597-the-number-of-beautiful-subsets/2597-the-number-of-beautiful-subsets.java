class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        int n=nums.length;
        int count=n;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(nums[i]-nums[j])!=k)count++;
            }
        }
        return count;
    }
}