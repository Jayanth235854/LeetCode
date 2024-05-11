class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum=0,n=points.length;
        for(int i=1;i<n;i++){
            int a=Math.abs(points[i][0]-points[i-1][0]);
            int b=Math.abs(points[i][1]-points[i-1][1]);
            sum+=Math.max(a,b);
        }
        return sum;
    }
}