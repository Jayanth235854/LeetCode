class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m=image.length,n=image[0].length;
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            int x=0,y=n-1;
            while(x<=y){
                arr[i][x]=image[i][y];
                arr[i][y]=image[i][x];
                x++; y--;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0)arr[i][j]=1;
                else arr[i][j]=0;
            }
        }
        return arr;
    }
}