class Solution {
    public int findMaxFish(int[][] grid) {
        int m=grid.length, n=grid[0].length,max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    int count=(bfs(i,j,grid,0));
                    max=Math.max(count,max);
                }
            }
        }
        return max;
    }
    public int bfs(int i,int j,int[][]grid, int count){
        int m=grid.length, n=grid[0].length;
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0) return count;
        count+=grid[i][j];
        grid[i][j]=0;
        count=bfs(i+1,j,grid,count);
        count=bfs(i-1,j,grid,count);
        count=bfs(i,j+1,grid,count);
        count=bfs(i,j-1,grid,count);
        return count;
    }
}