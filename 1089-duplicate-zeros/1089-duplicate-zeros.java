class Solution {
    public void duplicateZeros(int[] arr) {
        int zero=0,n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0)zero++;
        }
        for(int i=n-1, j=n+zero-1; i<j ; i--,j--){
            if(arr[i]!=0){
                if(j<n) arr[j]=arr[i];
            }else{
                if(j<n)arr[j]=0;
                j--;
                if(j<n)arr[j]=0;
            }
        }
    }
}