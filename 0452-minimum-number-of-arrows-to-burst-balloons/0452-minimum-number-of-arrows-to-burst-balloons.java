class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        
        int arrows = 1;
        int prevEnd = points[0][1];
        
        for (int i = 1; i < points.length; i++) {
            int currentStart = points[i][0];
            int currentEnd = points[i][1];
            if (currentStart > prevEnd) {
                arrows++;
                prevEnd = currentEnd;
            }
        }
        return arrows;
    }
}