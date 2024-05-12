class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        float[] arr=new float[n/2];
        for(int i=0,j=n-1;i<n/2;i++,j--){
            float avg=((float)(nums[i])+(float)(nums[j]))/2;
            arr[i]=avg;
            System.out.print(avg+" ");
        }
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<n/2-1;i++){
            if(arr[i]==arr[i+1])continue;
            count++;
        }
        return count;
    }
}