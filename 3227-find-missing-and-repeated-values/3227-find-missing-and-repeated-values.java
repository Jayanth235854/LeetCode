class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int l=grid.length;
        int n=l*l;
        int sum=n*(n+1)/2;
        int total=0,rep=0;
        for(int x=1;x<=n;x++){
            int count=0;
            for(int i=0;i<l;i++){
                for(int j=0;j<l;j++){
                    if(grid[i][j]==x)count++;
                }
            }
            if(count==2){
                rep=x;
                break;
            }
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                total+=grid[i][j];
            }
        }
        int m=sum-(total-rep);
        int[] arr=new int[2];
        arr[0]=rep;
        arr[1]=m;
        return arr;
    }
}