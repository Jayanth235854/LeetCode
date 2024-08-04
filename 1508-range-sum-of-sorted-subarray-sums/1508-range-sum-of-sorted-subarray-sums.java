class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] arr=new int[n*(n+1)/2];
        int c=0;
        for(int i=0;i<nums.length;i++){
            arr[c++]=nums[i];
            int tot=nums[i];
            for(int j=i+1;j<nums.length;j++){
                tot+=nums[j];
                arr[c++]=tot;
            }
        }
        Arrays.sort(arr);
        int ans=0;
        for(int i=left-1;i<right;i++)ans+=arr[i];
        return (ans%1000000007);
    }
}