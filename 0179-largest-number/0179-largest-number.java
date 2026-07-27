class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0]+"";
        for(int j=1;j<n;j++){
            int i=j;
            while(i>0){
                String a=nums[i-1]+"";
                String b=nums[i]+"";
                String fwd=a+b, bwd=b+a;
                if(bwd.compareTo(fwd)>0){
                    int t=nums[i];
                    nums[i]=nums[i-1];
                    nums[i-1]=t;
                }
                i--;
            }
        }
        if(nums[0]==0)return "0";
        String s="";
        for(int l:nums)s+=l+"";
        return s;
    }
}