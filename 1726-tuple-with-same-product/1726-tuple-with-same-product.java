class Solution {
    public int tupleSameProduct(int[] nums) {
        int n=nums.length,ans=0;
        Map<Integer,Integer> hm=new HashMap();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int num=nums[i]*nums[j];
                ans+=8*hm.getOrDefault(num,0);
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
        }
        return ans;
    }
}