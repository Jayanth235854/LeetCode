class Solution {
    int m, n;
    int[][] dp;

    public int maxMoves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        dp = new int[m][n]; // DP array for memoization
        
        // Initialize dp array to -1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        int maxMoves = 0;

        // Start from every cell in the first column
        for (int i = 0; i < m; i++) {
            maxMoves = Math.max(maxMoves, dfs(grid, i, 0));
        }

        return maxMoves;
    }

    private int dfs(int[][] grid, int row, int col) {
        // If we have reached the last column, we cannot make any more moves
        if (col == n - 1) {
            return 0;
        }

        // If already calculated, return the cached result
        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        int maxMoves = 0;

        // Check the possible moves
        for (int[] move : new int[][]{{-1, 1}, {0, 1}, {1, 1}}) {
            int newRow = row + move[0];
            int newCol = col + move[1];

            // Check bounds and value condition
            if (newRow >= 0 && newRow < m && newCol < n && grid[newRow][newCol] > grid[row][col]) {
                maxMoves = Math.max(maxMoves, 1 + dfs(grid, newRow, newCol));
            }
        }

        // Store the result in dp array
        dp[row][col] = maxMoves;
        return maxMoves;
    }
}
