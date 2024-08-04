class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int total=0;
        for(int i=0;i<nums.length;i++){
            total*=2;
            total+=nums[i];
            if(total%5==0)ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}