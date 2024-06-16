class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans=new int[2];
        int max=0,index=0,m=mat.length,n=mat[0].length;
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1)count++;
            }
            if(count>max){
                max=count;
                index=i;
            }
        }
        ans[0]=index;
        ans[1]=max;
        return ans;
    }
}