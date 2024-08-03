class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int at=0,bt=0, m=aliceSizes.length, n=bobSizes.length;
        for(int i=0;i<m;i++)at+=aliceSizes[i];
        for(int i=0;i<n;i++)bt+=bobSizes[i];
        System.out.print(at+" "+bt);
        int[] ans=new int[2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int alice=at-aliceSizes[i]+bobSizes[j] , bob=bt-bobSizes[j]+aliceSizes[i];
                if(alice==bob){
                    ans[0]=aliceSizes[i];
                    ans[1]=bobSizes[j];
                    return ans;
                }
            }
        }
        return ans;
    }
}