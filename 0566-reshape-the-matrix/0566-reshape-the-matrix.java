class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length*mat[0].length,d=0;
        if(n!=r*c)return mat;
        int[] a=new int[n];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                a[d++]=mat[i][j];
            }
        }
        d=0;
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=a[d++];
            }
        }
        return arr;
    }
}