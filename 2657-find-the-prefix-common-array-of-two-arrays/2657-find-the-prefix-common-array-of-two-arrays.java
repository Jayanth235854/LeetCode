class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length,count=0;
        int[] arr=new int[n],common=new int[51];
        for(int i=0;i<n;i++){
            common[A[i]]++;
            common[B[i]]++;
            if(A[i]==B[i])count++;
            else if(common[A[i]]>=2 && common[B[i]]>=2)count+=2;
            else if(common[A[i]]>=2 || common[B[i]]>=2)count++;
            arr[i]=count;
        }
        return arr;
    }
}