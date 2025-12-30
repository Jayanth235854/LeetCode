class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int count=0;
        if(m<3 || n<3) return 0;
        for(int i=0;i<=m-3;i++){
            for(int j=0;j<=n-3;j++){
                if(checkMagic(grid,i,j,i+3,j+3)) count++;
            }
        }
        return count;
    }
    public boolean checkMagic(int[][] grid,int row,int col,int m,int n){
        int colSum=-1,rowSum=-1;
        int[] arr=new int[10];
        for(int i=row;i<m;i++){
            for(int j=col;j<n;j++){
                if(grid[i][j]<10)arr[grid[i][j]]++;
                else return false;
            }
        }
        for(int i=1;i<10;i++){
            if(arr[i]!=1) return false;
        }
        for(int i=row;i<m;i++){
            int sum=0;
            for(int j=col;j<n;j++){
                if(grid[i][j]>9) return false;
                sum+=grid[i][j];
            }
            if(sum!=rowSum && rowSum!=-1) return false;
            rowSum=sum;
        }
        for(int i=col;i<n;i++){
            int sum=0;
            for(int j=row;j<m;j++){
                if(grid[j][i]>9) return false;
                sum+=grid[j][i];
            }
            if(sum!=colSum && colSum!=-1) return false;
            colSum=sum;
        }
        int sum1=0,sum2=0;
        for(int i=row, j=col;i<m && j<n;i++,j++){
            if(grid[i][j]>9)return false;
            sum1+=grid[i][j];
        }
        for(int i=row, j=n-1;i<m && j>=0;i++,j--){
            if(grid[i][j]>9)return false;
            sum2+=grid[i][j];
        }
        if(sum1!=sum2) return false;
        return true;
    }
}