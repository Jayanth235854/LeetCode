class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!check(board,i,j)) return false;
                }
            }
        }
        return true;
    }
    public boolean check(char[][] b,int row,int col){
        char val=b[row][col];
        for(int i=0;i<9;i++){
            if(b[row][i]==val && col!=i) return false;
            if(b[i][col]==val && row!=i) return false;
        }
        int dr=(row/3)*3, dc=(col/3)*3;
        for(int i=dr;i<dr+3;i++){
            for(int j=dc;j<dc+3;j++){
                if(b[i][j]==val && i!=row && j!=col) return false;
            }
        }
        return true;
    }
}