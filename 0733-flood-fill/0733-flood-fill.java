class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        fill(image, sr, sc, image[sr][sc], color);
        return image;
    }
    private void fill(int[][] image, int i, int j, int targetColor, int newColor) {
        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != targetColor) {
            return; 
        }
        image[i][j] = newColor;
        fill(image, i + 1, j, targetColor, newColor);
        fill(image, i - 1, j, targetColor, newColor);
        fill(image, i, j + 1, targetColor, newColor);
        fill(image, i, j - 1, targetColor, newColor);
    }
}