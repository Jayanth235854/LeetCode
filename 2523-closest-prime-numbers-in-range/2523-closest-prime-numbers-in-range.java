class Solution {
    public int[] closestPrimes(int left, int right) {
        int min=Integer.MAX_VALUE;
        int[] ans=new int[2];
        for(int i=left;i<=right;i++){
            if(i==1)continue;
            int sq=(int)Math.sqrt(i),flag=0;
            for(int j=2;j<=sq;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                if(ans[0]==0)ans[0]=i;
                else if(ans[1]==0){
                    ans[1]=i;
                    min=ans[1]-ans[0];
                }
                else{
                    if(i-ans[1]<min){
                        min=i-ans[1];
                        ans[0]=ans[1];
                        ans[1]=i;
                    }
                }
            }
        }
        if(ans[0]==0 || ans[1]==0)return new int[]{-1,-1};
        return ans;
    }
}