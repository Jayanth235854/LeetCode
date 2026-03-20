class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        // Step 1: Remove boundary-connected land
        for (int i = 0; i < m; i++) {
            dfs(grid, i, 0, m, n);
            dfs(grid, i, n - 1, m, n);
        }
        for (int j = 0; j < n; j++) {
            dfs(grid, 0, j, m, n);
            dfs(grid, m - 1, j, m, n);
        }
        // Step 2: Count remaining land
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) count++;
            }
        }
        return count;
    }

    public void dfs(int[][] g, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || g[i][j] == 0) return;
        g[i][j] = 0;

        dfs(g, i + 1, j, m, n);
        dfs(g, i - 1, j, m, n);
        dfs(g, i, j + 1, m, n);
        dfs(g, i, j - 1, m, n);
    }
}