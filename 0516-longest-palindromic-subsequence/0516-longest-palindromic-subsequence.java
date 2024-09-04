class Solution {
    String s;
    int[][]dp;
    int lps(int i,int j){
        if(i>j)return 0;
        if(i==j)return 1;
        if(dp[i][j]!=0)return dp[i][j];
        if(s.charAt(i)==s.charAt(j))return dp[i][j]=lps(i+1,j-1)+2;
        else return dp[i][j]= Math.max(lps(i+1,j),lps(i,j-1));
    }
    public int longestPalindromeSubseq(String s) {
        this.s=s;
        int n=s.length();
        dp=new int[n][n];
        return lps(0,n-1);
    }
}