class Solution {
    public String oddString(String[] words) {
        int m = words.length, n = words[0].length();
        int[][] arr = new int[m][n - 1];
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j - 1] = words[i].charAt(j) - words[i].charAt(j - 1);
            }
        }
        for (int i = 0; i < m; i++) {
            boolean isOdd = true;
            for (int j = 0; j < m; j++) {
                if (i != j && Arrays.equals(arr[i], arr[j])) {
                    isOdd = false;
                    break;
                }
            }
            if (isOdd) return words[i];
        }
        return "";
    }
}
