class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n=nums.size(),ans=0,c=0;
        if(n==1)return 0;
        for(int i=0;i<n-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                ans= n-i-1;
                c++;
            }
        }
        if(c>1 ||(ans!=0 && nums.get(0)<nums.get(n-1)))return -1;
        return ans;
    }
}