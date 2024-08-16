class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        int max=nums.length/3;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int el=entry.getKey();
            int c=entry.getValue();
            if(c>max)ans.add(el);
        }
        return ans;
    }
}