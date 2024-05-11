class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int mn=nums[0],mx=nums[nums.length-1];
        if(mx%mn==0)return mn;
        for(int i=mn-1;i>1;i--){
            if(mn%i==0 && mx%i==0)return i;
        }
        return 1;
    }
}