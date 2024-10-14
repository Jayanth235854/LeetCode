class Solution {
    public long maxKelements(int[] nums, int k) {
        int score=0, n=nums.length-1;
        while(k>0){
            Arrays.sort(nums);
            score+=nums[n];
            System.out.println(nums[n]);
            nums[n]=(int)Math.ceil((float)nums[n]/3);
            k--;
        }
        return score;
    }
}