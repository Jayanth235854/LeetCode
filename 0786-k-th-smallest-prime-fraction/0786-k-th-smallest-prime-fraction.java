class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int c=0;
        for(int i=arr.length-1;i>0;i--)c+=i;
        float[] ans=new float[c];
        c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                ans[c++]=(float)arr[i]/arr[j];
            }
        }
        Arrays.sort(ans);
        float s=ans[k-1];
        int[] res=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(s==(float)arr[i]/arr[j]){
                    res[0]=arr[i];
                    res[1]=arr[j];
                    break;
                }
            }
        }
        return res;
    }
}