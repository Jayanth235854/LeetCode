class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0)return 0;
        else if(n==1 ||n==2)return 1;
        int[] nums=new int[n+1];
        nums[0]=0;
        nums[1]=1;
        int i=1,count=0,max=0;
        for(int j=2;j<=n;j++){
            count++;
            if(count==1)nums[2*i]=nums[i];
            if(count==2){
                nums[2*i+1]=nums[i]+nums[i+1];
                count=0;
                i++;
            }
        }
        for(i=0;i<=n;i++){
            if(nums[i]>max)max=nums[i];
        }
        return max;
    }
}