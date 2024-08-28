class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        for (int i = 0; i < grid1.length; ++i) {
            for (int j = 0; j < grid1[0].length; ++j) {
                grid1[i][j] = grid1[i][j] * 2 - grid2[i][j];
            }
        }
        int count = 0;
        for (int i = 0; i < grid1.length; ++i) {
            for (int j = 0; j < grid1[0].length; ++j) {
                if (grid1[i][j] == 1 && isValid(grid1, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
    
    private boolean isValid(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) {
            return true;
        }
        
        if (grid[r][c] == 2 || grid[r][c] == 0) return true;
        
        if (grid[r][c] == -1) return false;
        
        grid[r][c] = 0;
        
        return isValid(grid, r-1, c) & isValid(grid, r+1, c) & isValid(grid, r, c+1) & isValid(grid, r, c-1);
        
    }
}