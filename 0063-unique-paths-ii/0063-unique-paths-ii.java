class Solution {
    int m,n;
    int[][] dp;
    int upo(int i,int j,int[][]og){
        if(i>=m || j>=n)return 0;
        if(og[i][j]==1) return 0;
        if(i==m-1 && j==n-1)return 1;
        if(dp[i][j]!=0)return dp[i][j];
        return dp[i][j]=upo(i+1,j,og)+upo(i,j+1,og);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        m=obstacleGrid.length;
        n=obstacleGrid[0].length;
        dp=new int[m][n];
        return upo(0,0,obstacleGrid);
    }
}