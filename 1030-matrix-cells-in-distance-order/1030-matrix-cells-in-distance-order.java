class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<int[]> cells = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int distance = Math.abs(i - rCenter) + Math.abs(j - cCenter);
                cells.add(new int[] {i, j, distance});
            }
        }
        cells.sort((a, b) -> Integer.compare(a[2], b[2]));
        int[][] result = new int[rows * cols][2];
        for (int i = 0; i < result.length; i++) {
            result[i][0] = cells.get(i)[0];
            result[i][1] = cells.get(i)[1];
        }
        
        return result;
    }
}