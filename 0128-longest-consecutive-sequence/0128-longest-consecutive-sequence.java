class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length,count=1,max=1;
        if(n==0)return 0;
        Map<Integer,Integer> hm=new TreeMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> m:hm.entrySet()){
            int num=m.getKey();
            if(hm.containsKey(num+1)) count++;
            else{
                max=Math.max(max,count);
                count=1;
            }
        }
        return max;
    }
}