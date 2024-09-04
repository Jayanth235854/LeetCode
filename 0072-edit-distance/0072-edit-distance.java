class Solution {
    String s1,s2;
    int dp[][];
    int md(int i,int j){
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==0)return j;
        if(j==0)return i;
        if(s1.charAt(i-1)==s2.charAt(j-1))return dp[i][j]=md(i-1,j-1);
        else return dp[i][j]= Math.min(md(i,j-1)+1,Math.min(md(i-1,j)+1,md(i-1,j-1)+1));
    }
    public int minDistance(String word1, String word2) {
        this.s1=word1;
        this.s2=word2;
        int m=word1.length(), n=word2.length();
        dp=new int[m+1][n+1];
        for(int[] i:dp)Arrays.fill(i,-1);
        return md(m,n);
    }
}