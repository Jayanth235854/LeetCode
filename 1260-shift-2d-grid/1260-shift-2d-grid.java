class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length,n=grid[0].length;
        int[] arr=new int[n*m];
        k=k%(m*n);
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[c++]=grid[i][j];
            }
        }
        rev(arr,0,m*n-k-1);
        rev(arr,m*n-k,m*n-1);
        rev(arr,0,m*n-1);
        List<List<Integer>> ls=new ArrayList<>();
        c=0;
        for(int i=0;i<m;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++){
                temp.add(arr[c++]);
            }
            ls.add(temp);
        }
        return ls;
    }
    public void rev(int[] arr,int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++; end--;
        }
    }
}