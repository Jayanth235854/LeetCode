class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int c=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])c++;
            }
            if(c>2)return false;
        }
        return true;
    }
}