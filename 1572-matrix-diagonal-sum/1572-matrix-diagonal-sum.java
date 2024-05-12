class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0,j=0,sum=0,n=mat.length;
        while(i<n){
            sum+=mat[i][j];
            i++;
            j++;
        }
        i=0;
        j=n-1;
        while(i<n){
            if(i!=j){
                sum+=mat[i][j];
            }
            i++;
            j--;
        }
        return sum;
    }
}