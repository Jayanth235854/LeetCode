class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        LinkedList<int[]> ans=new LinkedList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<n;i++)System.out.println(intervals[i][0]+" "+intervals[i][1]);
        ans.add(new int[]{intervals[0][0],intervals[0][1]});
        for(int i=1;i<n;i++){
            if(ans.getLast()[1]>=intervals[i][0]){
                int l=Math.max(ans.getLast()[1],intervals[i][1]);
                ans.getLast()[1]=l;
            }else{
                ans.add(new int[]{intervals[i][0],intervals[i][1]});
            }
        }
        int[][] arr=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            arr[i][0]=ans.get(i)[0];
            arr[i][1]=ans.get(i)[1];
        }
        return arr;
    }
}