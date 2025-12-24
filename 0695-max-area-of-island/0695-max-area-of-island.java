class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length, n=grid[0].length,max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int area = help(grid,i,j,m,n);
                    max=Math.max(max,area);
                }
            }
        }
        return max;
    }
    public int help(int[][] grid,int i,int j,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==0) return 0;
        grid[i][j]=0;
        int area=1;
        area+= help(grid,i-1,j,m,n);
        area+= help(grid,i+1,j,m,n);
        area+= help(grid,i,j-1,m,n);
        area+= help(grid,i,j+1,m,n);
        return area;
    }
}