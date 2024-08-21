class Solution {
    public int strangePrinter(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int[][] dp = new int[n][n];
        return ans(0, n - 1, s, dp);
    }

    private int ans(int i, int j, String s, int[][] dp) {
        if (i > j) return 0; 
        if (i == j) return 1; 
        if (dp[i][j] != 0) return dp[i][j];
        int minTurns = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            minTurns = Math.min(minTurns, ans(i, k, s, dp) + ans(k + 1, j, s, dp));
        }
        if (s.charAt(i) == s.charAt(j)) {
            minTurns = Math.min(minTurns, ans(i, j - 1, s, dp));
        }
        dp[i][j] = minTurns;
        return dp[i][j];
    }
}
