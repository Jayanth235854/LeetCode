class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int c=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                seen.add(nums[i]);
                c=0;
            }else{
                int l=seen.size();
                if(l<=c)ans.add(-1);
                else ans.add(seen.get(l-1-c));
                c++;
            }
        }
        return ans;
    }
}