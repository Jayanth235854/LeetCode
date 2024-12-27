class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=0,a=values[0],n=values.length;
        for(int j=1;j<n;j++){
            max=Math.max(max,a+values[j]-j);
            a=Math.max(a,values[j]+j);
        }
        return max;
    }
}