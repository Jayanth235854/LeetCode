class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
        int m=grid.length,n=grid[0].length,sum=0,l=n-1;
        while(l>-1){
            int max=0;
            for(int i=0;i<m;i++){
                max=Math.max(max,grid[i][l]);
            }
            sum+=max;
            l--;
        }
        return sum;
    }
}