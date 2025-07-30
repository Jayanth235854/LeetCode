class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int rot=0,zeros=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)rot++;
                if(grid[i][j]==0)zeros++;
            }
        }
        if(rot+zeros==m*n)return 0;
        if(rot==0)return -1;
        int[][] visit=new int[m][n];

        for(int x=0;x<m*n;x++){
            int count=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==2 && visit[i][j]==0){
                        visit[i][j]=1;
                        if(i>0 && grid[i-1][j]==1){ grid[i-1][j]=2; visit[i-1][j]=2;}
                        if(j>0 && grid[i][j-1]==1){ grid[i][j-1]=2; visit[i][j-1]=2;}
                        if(i<m-1 && grid[i+1][j]==1){ grid[i+1][j]=2; visit[i+1][j]=2;}
                        if(j<n-1 && grid[i][j+1]==1){ grid[i][j+1]=2; visit[i][j+1]=2;}
                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(visit[i][j]==2)visit[i][j]=0;
                    if(grid[i][j]==2)count++;
                }
            }
            if(count+zeros==m*n)return x+1;
        }
        return -1;
    }
}