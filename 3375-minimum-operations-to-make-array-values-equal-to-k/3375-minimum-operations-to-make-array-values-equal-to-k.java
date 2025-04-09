class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length,count=0;
        Arrays.sort(nums);
        if(nums[0]<k)return -1;
        if(n==1){
            if(nums[0]==k)return 0;
            else return 1;
        }
        while(true){
            int t=n-2;
            while(t>0 && nums[t]==nums[t+1])t--;
            if(nums[n-1]==k)break;
            count++;
            if(nums[0]==nums[n-1])break;
            int temp=nums[t];
            for(int i=t;i<n;i++){
                if(nums[i]>temp)nums[i]=temp;
            }
        }
        return count;
    }
}