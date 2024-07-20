class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m=rowSum.length , n=colSum.length , result[][]=new int[m][n];
        int r=0 , c=0;
        while(r<m&&c<n){
            int min=Math.min(rowSum[r],colSum[c]);
            result[r][c]=min;
            rowSum[r]-=min;
            colSum[c]-=min;
            if(rowSum[r]==0) r++;
            else c++;
        }
        return result;
    }
}