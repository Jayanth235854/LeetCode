class Solution {
    public double largestTriangleArea(int[][] points) {
        double area=0,max=0;
        int n=points.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n && j!=i;j++){
                for(int k=0;k<n && k!=j && k!=i;k++){
                    area=0.5 * Math.abs(points[i][0] * (points[j][1]-points[k][1])+ points[j][0] * (points[k][1]-points[i][1])+ points[k][0] * (points[i][1]-points[j][1]));
                    if(area>max)max=area;
                }
            }
        }
        return max;
    }
}