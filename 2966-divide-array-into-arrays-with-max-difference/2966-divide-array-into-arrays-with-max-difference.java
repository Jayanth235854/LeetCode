class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        int[][] arr=new int[n/3][3];
        Arrays.sort(nums);
        for(int i=0;i<n;i+=3){
            if(nums[i+2]-nums[i]>k) return new int[0][0];
            int[] temp=new int[]{nums[i],nums[i+1],nums[i+2]};
            arr[i/3]=temp;
        }
        return arr;
    }
}