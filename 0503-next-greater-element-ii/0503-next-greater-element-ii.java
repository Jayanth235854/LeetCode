class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(j==n)j=0;
                if(nums[i]<nums[j]){
                    arr[i]=nums[j];
                    break;
                }
                if(i==j){
                    arr[i]=-1;
                    break;
                }
            }
        }
        return arr;
    }
}