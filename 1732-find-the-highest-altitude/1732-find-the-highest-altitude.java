class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i+1]=arr[i]+gain[i];
        }
        int max=-10000;
        for(int i=0;i<n+1;i++){
            if(arr[i]>max)max=arr[i];
        }
        return max;
    }
}