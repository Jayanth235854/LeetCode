class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length, n=matrix[0].length;
        int row=m-1, col=0;
        while(row>=0 && col<n){
            int num=matrix[row][col];
            if(num==target)return true;
            else if(num>target)row--;
            else col++;
        }
        return false;
    }
}