class Solution {
    static int m,n;
    static int[][] arr;
    static int[][] dp;
    static int[] dr,dc;
    public int longestIncreasingPath(int[][] matrix) {
        m=matrix.length;
        n=matrix[0].length;
        dp=new int[m][n];
        dr=new int[]{1,-1,0,0};
        dc=new int[]{0,0,1,-1};
        arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=matrix[i][j];
            }
        }
        int ans=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans=Math.max(ans,dfs(i,j));
            }
        }
        return ans;
    }
    public static int dfs(int r,int c){
        if(dp[r][c]!=0) return dp[r][c];
        int ans=1;
        for(int i=0;i<4;i++){
            int row=dr[i]+r, col=dc[i]+c;
            if(row>=0 && row<m && col>=0 && col<n && arr[row][col]>arr[r][c]){
                ans=Math.max(ans,1+dfs(row,col));
            }
        }
        return dp[r][c]=ans;
    }
}