class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int n=intervals.length, ans=0, cet=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=cet) cet=intervals[i][1];
            else ans++;
        }
        return ans;
    }
}