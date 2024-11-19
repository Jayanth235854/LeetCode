class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0,max=0;
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0;i<k;i++){
            sum+=nums[i];
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        if(hm.size()==k)max=sum;
        for(int i=k;i<n;i++){
            hm.put(nums[i-k],hm.get(nums[i-k])-1);
            if(hm.get(nums[i-k])==0) hm.remove(nums[i-k]);
            sum+=nums[i]-nums[i-k];
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

            if(hm.size()==k) max=Math.max(sum,max);
        }
        return max;
    }
}