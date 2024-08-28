class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long ans=0,n=rectangles.length;
        Map<Double,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            double ratio=(double)rectangles[i][0]/rectangles[i][1];
            ans+=hm.getOrDefault(ratio,0);
            hm.put(ratio,hm.getOrDefault(ratio,0)+1);
        }
        return ans;
    }
}