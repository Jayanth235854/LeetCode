class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            row.add(min);
        }
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            col.add(max);
        }
        List<Integer> ans = new ArrayList<>();
        for (int r : row) {
            if (col.contains(r)) {
                ans.add(r);
            }
        }
        return ans;
    }
}