class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=10000,n=points.length,index=-1;
        for(int i=0;i<n;i++){
            if(x==points[i][0] || y==points[i][1]){
                int man=Math.abs(points[i][0]-x) + Math.abs(points[i][1]-y);
                if(man<min){
                    min=man;
                    index=i;
                }
            }
        }
        if(index>-1)return index;
        return -1;
    }
}