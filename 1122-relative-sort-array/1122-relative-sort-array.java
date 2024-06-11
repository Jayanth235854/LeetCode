class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int c=0,n=arr2.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    int a=arr1[c];
                    arr1[c++]=arr2[i];
                    arr1[j]=a;
                }
            }
        }
        for(int i=c;i<arr1.length;i++){
            for(int j=c+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    int a=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=a;
                }
            }
        }
        return arr1;
    }
}