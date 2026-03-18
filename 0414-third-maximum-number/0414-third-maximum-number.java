class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)set.add(nums[i]);
        List<Integer> ls=new ArrayList<>();
        for(int i:set)ls.add(i);
        Collections.sort(ls);
        if(ls.size()<3) {
            if(ls.size()==2)return ls.get(1);
            return ls.get(0);
        }
        return ls.get(ls.size()-3);
    }
}