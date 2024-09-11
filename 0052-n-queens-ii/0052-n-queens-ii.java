class Solution {
    public int totalNQueens(int n) {
        char[][] cur=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cur[i][j]='.';
            }
        }
        int[] res=new int[1];
        solve(0,cur,res,n);
        return res[0];
    }
    public void solve(int row, char[][] cur,int[] res,int n){
        if(row==n){
            res[0]++;
            return;
        }
        for(int col=0;col<n;col++){
            if(check(row,col,cur)){
                cur[row][col]='Q';
                solve(row+1,cur,res,n);
                cur[row][col]='.';
            }
        }
    }
    public boolean check(int row, int col, char[][] cur){
        for(int i=row-1;i>=0;i--){
            if(cur[i][col]=='Q')return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(cur[i][j]=='Q')return false;
        }
        for(int i=row-1, j=col+1;i>=0 && j<cur.length;i--,j++){
            if(cur[i][j]=='Q')return false;
        }
        return true;
    }
}