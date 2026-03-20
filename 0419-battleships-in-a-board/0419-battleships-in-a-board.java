class Solution {
    public int countBattleships(char[][] board) {
        int m=board.length,n=board[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='X'){
                    count++;
                    dfs(board,i,j,m,n);
                }
            }
        }
        return count;
    }
    public void dfs(char[][] b,int i,int j,int m,int n){
        if(i>=m || j>=n || b[i][j]=='.' ) return;
        b[i][j]='.';
        dfs(b,i+1,j,m,n);
        dfs(b,i,j+1,m,n);
    }
}