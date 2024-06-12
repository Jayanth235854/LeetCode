class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        double sum=0;
        int min=n*5/100;
        for(int i=min;i<n-min;i++)sum+=arr[i];
        int k=n-(2*min);
        double ans=sum/k;
        return ans;
    }
}