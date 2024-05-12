class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> arr=new ArrayList<>();
        int cur=0;
        while(cur<intervals.length && intervals[cur][1]<newInterval[0]){
            arr.add(intervals[cur++]);
        }
        while(cur<intervals.length && intervals[cur][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[cur][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[cur][1],newInterval[1]);
            cur++;
        }
        arr.add(newInterval);
        while(cur<intervals.length){
            arr.add(intervals[cur++]);
        }
        return arr.toArray(new int[arr.size()][]);
    }
}