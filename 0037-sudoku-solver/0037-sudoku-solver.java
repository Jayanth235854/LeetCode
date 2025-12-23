class Solution {
    public Boolean check(int row, int col, char[][] b,int num){
        for(int i=0;i<9;i++){
            if(b[i][col]==(char)(num+'0'))return false;
            if(b[row][i]==(char)(num+'0'))return false;
        }
        int brow=(row/3)*3, bcol=(col/3)*3;
        for(int i=brow;i<brow+3;i++){
            for(int j=bcol;j<bcol+3;j++){
                if(b[i][j]==(char)(num+'0'))return false;
            }
        }
        return true;
    }
    public boolean helper(char[][] b, int row,int col){
        if(row==b.length)return true;
        int nr=0,nc=0;
        if(col==8)nr=row+1;
        else{
            nr=row; nc=col+1;
        }

        if(b[row][col]!='.'){
            if(helper(b,nr,nc)) return true;
        }else{
            for(int i=1;i<=9;i++){
                if(check(row,col,b,i)){
                    b[row][col]=(char)(i+'0');
                    if(helper(b,nr,nc))return true;
                    else b[row][col]='.';
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
}