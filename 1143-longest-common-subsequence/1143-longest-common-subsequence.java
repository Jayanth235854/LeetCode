class Solution {
    String a,b;
    int m,n;
    int[][] dp;
    int lcp(int i, int j){
        if(i>=m || j>=n)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(a.charAt(i)==b.charAt(j))return dp[i][j]=lcp(i+1,j+1)+1;
        else return dp[i][j]= Math.max(lcp(i+1,j),lcp(i,j+1));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        a=text1;
        b=text2;
        m=text1.length();
        n=text2.length();
        dp=new int[m][n];
        for(int[] i:dp)Arrays.fill(i,-1);
        return lcp(0,0);
    }
}