class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        for(int i=0;i<n;i++){
            if(intervals[i][0]==-1)continue;
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]==-1)continue;
                int a1=intervals[i][0],b1=intervals[j][0];
                int a2=intervals[i][1],b2=intervals[j][1];
                if(b1<=a2){
                    if(b2>a2){
                        intervals[i][1]=b2;
                    }
                    intervals[j][0]=-1;
                    intervals[j][1]=-1;
                }
            }
        }
        int zero=0,c=0;
        for(int i=0;i<n;i++) if(intervals[i][0]==-1) zero++;
        int[][] arr=new int[n-zero][2];
        for(int i=0;i<n;i++){
            if(intervals[i][0]!=-1){
                arr[c][0]=intervals[i][0];
                arr[c][1]=intervals[i][1];
                c++;
            }
        }
        return arr;
    }
}