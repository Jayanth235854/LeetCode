class Solution {
    public int minPathCost(int[][] nums, int[][] moves) {
        int m = nums.length, n = nums[0].length;
        int[][] dp = new int[m][n];

        // Initialize last row costs (no moves from here)
        for (int c = 0; c < n; c++) dp[m - 1][c] = nums[m - 1][c];

        // Fill from second-last row to top
        for (int r = m - 2; r >= 0; r--) {
            for (int c = 0; c < n; c++) {
                dp[r][c] = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    int move = moves[nums[r][c]][i];
                    dp[r][c] = Math.min(dp[r][c], nums[r][c] + move + dp[r + 1][i]);
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int c = 0; c < n; c++) ans = Math.min(ans, dp[0][c]);
        return ans;
    }
}