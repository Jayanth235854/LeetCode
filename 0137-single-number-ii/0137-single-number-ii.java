class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        Set<Integer> a=new HashSet<>();
        long setSum=0, arrSum=0;
        for(int i=0;i<n;i++){
            if(!a.contains(nums[i])){
                a.add(nums[i]);
                setSum+=nums[i];
            }
            arrSum+=nums[i];
        }
        long ans=(3*setSum-arrSum)/2;
        return (int)ans;
    }
}