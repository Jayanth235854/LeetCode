class Solution {
    public int maxOperations(int[] nums) {
        int sum=0,n=nums.length,count=1;
        int[] arr=new int[n/2];
        if(n%2==0){
            for(int i=0;i<n-1;i+=2){
                sum=nums[i]+nums[i+1];
                arr[i/2]=sum;
            }
        }else{
            for(int i=0;i<n-2;i+=2){
                sum=nums[i]+nums[i+1];
                arr[i/2]=sum;
            }
        }
        for(int i=0;i<(n/2)-1;i++){
            if(arr[i]==arr[i+1])count++;
            else break;
        }
        return count;
    }
}