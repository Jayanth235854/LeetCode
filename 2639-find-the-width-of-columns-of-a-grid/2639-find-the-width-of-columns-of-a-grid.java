class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<m;j++){
                int c=0;
                if(grid[j][i]<0)c++;
                int a=Math.abs(grid[j][i]);
                while(a>0){
                    c++;
                    a/=10;
                }
                if(c>max)max=c;
            }
            arr[i]=max;
            if(max==0)arr[i]=1;
        }
        return arr;
    }
}