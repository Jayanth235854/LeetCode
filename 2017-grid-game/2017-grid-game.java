class Solution {
    public long gridGame(int[][] grid) {
        long r1 = 0,r2=0;
        for (int num : grid[0]) r1+=num;
        long min= Long.MAX_VALUE;
        for (int i=0;i<grid[0].length;i++) {
            r1 -= grid[0][i];
            min = Math.min(min,Math.max(r1,r2));
            r2 += grid[1][i];
        }
        return min;
    }
}