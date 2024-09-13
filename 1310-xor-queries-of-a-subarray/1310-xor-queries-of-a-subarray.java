class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length, m=queries.length;
        int[] ans=new int[m];
        for(int i=0;i<m;i++){
            int a=0;
            for(int j=queries[i][0];j<=queries[i][1];j++)
                a^=arr[j];
            ans[i]=a;
        }
        return ans;
    }
}