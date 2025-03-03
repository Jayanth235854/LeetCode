class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int n=nums.length,ind=0,count=0;
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        if(nums[i]<pivot)arr[ind++]=nums[i];
        if(nums[i]==pivot)count++;
       }
       while(count>0){
        arr[ind++]=pivot;
        count--;
       }
       for(int i=0;i<n;i++){
        if(nums[i]>pivot)arr[ind++]=nums[i];
       }
        return arr;
    }
}