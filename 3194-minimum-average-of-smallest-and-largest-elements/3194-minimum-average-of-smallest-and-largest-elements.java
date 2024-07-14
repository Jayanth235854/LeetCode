class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        float[] avg=new float[n/2];
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
            avg[i]=(float)(nums[i]+nums[n-i-1])/2;
        }
        double min=avg[0];
        for(int i=1;i<n/2;i++){
            if(avg[i]<min)min=avg[i];
        }
        return min;
    }
}