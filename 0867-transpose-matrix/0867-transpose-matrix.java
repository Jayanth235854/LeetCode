class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=matrix[j][i];
            }
        }
        return mat;
    }
}