class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        int[][] answer=new int[r][c];
        for(int i=0;i<c;i++){
            int max=0,col=0,repeat=0;
            for(int j=0;j<r;j++){
                answer[j][i]=matrix[j][i];
                if(matrix[j][i]>max)max=matrix[j][i];
                if(matrix[j][i]==-1){
                    col=j;
                    repeat++;
                }
            }
            if(matrix[col][i]==-1)answer[col][i]=max;
            if(repeat>1){
                for(int j=0;j<r;j++){
                    if(matrix[j][i]==-1)answer[j][i]=max;
                }
            }
        }
        return answer;
    }
}