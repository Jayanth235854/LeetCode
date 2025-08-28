class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        for(int k=1;k<n;k++){
            List<Integer> ls=new ArrayList<>();
            int i=0,j=k;
            while(i<n && j<n){
                ls.add(grid[i][j]);
                i++; j++;
            }
            Collections.sort(ls);
            i=0;j=k;
            while(i<n && j<n){
                grid[i][j]=ls.get(i);
                i++; j++;
            }
        }
        for(int k=0;k<n;k++){
            List<Integer> ls=new ArrayList<>();
            int i=k, j=0;
            while(i<n && j<n){
                ls.add(grid[i][j]);
                i++; j++;
            }
            Collections.sort(ls);
            i=k;j=0;
            int s=ls.size()-1;
            while(i<n && j<n){
                grid[i][j]=ls.get(s--);
                i++; j++;
            }
        }
        return grid;
    }
}