class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max=0, m=mat.length, n=mat[0].length;
        int[] arr=new int[2];
        for(int i=0;i<m*n;i++){
            if(mat[i/n][i%n]>max){
                max=mat[i/n][i%n];
                arr[0]=i/n;
                arr[1]=i%n;
            }
        }
        return arr;
    }
}