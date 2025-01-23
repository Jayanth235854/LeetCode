class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length, n=grid[0].length,count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i>0 && grid[i-1][j]==1 && grid[i][j]==1)count++;
                else if(i<m-1 && grid[i+1][j]==1 && grid[i][j]==1)count++;
                else if(j>0 && grid[i][j-1]==1 && grid[i][j]==1)count++;
                else if(j<n-1 && grid[i][j+1]==1 && grid[i][j]==1)count++;
            }
        }
        return count;
    }
}