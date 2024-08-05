class Solution {
    public int numRookCaptures(char[][] board) {
        int[] r=new int[2];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++)if(board[i][j]=='R'){
                r[0]=i; r[1]=j;
                break;
            }
        }
        int i=r[0] ,j=r[1]-1,c=0;
        while(j>=0){
            if(board[i][j]=='.')j--;
            else if(board[i][j]=='p'){
                c++;
                break;
            }else break;
        }
        j=r[1]+1;
        while(j<8){
            if(board[i][j]=='.')j++;
            else if(board[i][j]=='p'){
                c++;
                break;
            }else break;
        }
        i=r[0]-1; j=r[1];
        while(i>=0){
            if(board[i][j]=='.')i--;
            else if(board[i][j]=='p'){
                c++;
                break;
            }else break;
        }
        i=r[0]+1;
        while(i<8){
            if(board[i][j]=='.')i++;
            else if(board[i][j]=='p'){
                c++;
                break;
            }else break;
        }
        return c;
    }
}