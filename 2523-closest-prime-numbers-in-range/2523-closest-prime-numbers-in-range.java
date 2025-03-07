class Solution {
    public int[] closestPrimes(int left, int right) {
        int min=Integer.MAX_VALUE;
        int[] ans=new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int prev = -1;
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
                if(i == 31)
                System.out.println(i + " " + prev);
                if(prev == -1){
                    prev = i;
                }
                else if(i-prev<min){
                    min=i-prev;
                    ans[0]=prev;
                    ans[1]=i;
                    // prev = i;
                }
                prev = i;
            }
        }
        System.out.println(min);
        // if(ans[0]==0 || ans[1]==0)return new int[]{-1,-1};
        return ans;
    }
}