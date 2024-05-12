class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] taken=new boolean[nums.length];
        for(int i:nums){
            if(taken[i])return i;
            taken[i]=true;
        }
        return 0;
    }
}