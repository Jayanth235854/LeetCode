class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] sol=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1)c++;
            }
            sol[i]=c;
        }
        int[] arr=new int[k];
        int c=0;
        for(int i=0;i<=mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                if(sol[j]==i)arr[c++]=j;
                if(c==k)break;
            }
            if(c==k)break;
        }
        return arr;
    }
}