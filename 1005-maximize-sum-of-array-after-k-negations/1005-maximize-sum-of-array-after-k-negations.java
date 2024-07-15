class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length,zero=0,c=0,sum=0;
        for(int i=0;i<n;i++){
            if(c==k)break;
            if(nums[i]<0)nums[i]=-nums[i];
            else if(nums[i]>=0){
                if(i!=0 && nums[i-1]<nums[i]){
                    zero=i-1;
                    break;
                }else{
                    zero=i;
                    break;
                }
            }
            c++;
        }
        while(c!=k){
            nums[zero]=-nums[zero];
            c++;
        }
        for(int i=0;i<n;i++)sum+=nums[i];
        return sum;
    }
}