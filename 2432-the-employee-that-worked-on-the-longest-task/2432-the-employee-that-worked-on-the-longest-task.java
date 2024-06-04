class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int work=logs[0][1],id=0,c=1;
        int[] arr=new int[logs.length];
        arr[0]=work;
        int max=work;
        for(int i=1;i<logs.length;i++){
            work=logs[i][1]-logs[i-1][1];
            arr[c++]=work;
            if(work>max) max=work;
        }
        int min=n;
        for(int i=0;i<logs.length;i++){
            if(max==arr[i]){
                if(logs[i][0]<min) min=logs[i][0];
            }
        }
        return min;
    }
}