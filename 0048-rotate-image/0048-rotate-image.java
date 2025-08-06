class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<=n/2;i++){
            for(int j=i;j<n-i-1;j++){
                int a=j,b=n-i-1;
                int temp=matrix[a][b];
                matrix[a][b]=matrix[i][j];
                while(a!=i || b!=j){
                    int c=a;
                    a=b; b=n-c-1;
                    int t=matrix[a][b];
                    matrix[a][b]=temp;
                    temp=t;
                }
            }
        }
    }
}